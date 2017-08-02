import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.util.Duration;

/**
 * The Pacman app that contains the board
 * 
 * @author Rohit Nawani
 *
 */
public class PacmanApp extends Application {
	private static final double MILLISEC = 150;
	private Timeline animation;
	private PacmanGame game = new PacmanGame(this);
	private PacmanGameBoard gameBoard = game.getGameBoard();
	private Label ready = new Label() ;
	private Pane readyPane = new Pane() ;
	private Label congrats = new Label() ;
	private Pane congratsPane = new Pane() ;
	private Label gameOver = new Label() ;
	private Pane gameOverPane = new Pane() ;
	private BorderPane pane = new BorderPane();

	@Override
	public void start(Stage primaryStage) {
		gameBoard.setStyle("-fx-background-color: black;"); 
		setReady() ;
		setCongrats();
		setGameOver();
		pane.setCenter(gameBoard);
		// Create Scene
		Scene scene = new Scene(pane, 800, 800);
		
		
		setUpKeyPresses();
		setUpAnimation();

		// Set Stage
		primaryStage.setTitle("Pacman"); // Set the stage title
		primaryStage.setScene(scene); // Place the scene in the stage
		primaryStage.show(); // Display the stage
	}

	public void showReady(){
		pane.setBottom(readyPane);
	}
	
	public void removeReady(){
		pane.setBottom(null);
	}

	private void setReady(){
		ready.setText("        READY!?");
    	ready.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 100));
    	ready.setTextFill(Color.GREEN);
    	readyPane.setStyle("-fx-background-color: black;");
    	readyPane.setPrefSize(100,100);
    	readyPane.setPadding(new Insets(50, 50, 50, 50));	
    	readyPane.getChildren().add(ready);
	}
	
	private void setCongrats(){
		congrats.setText("\n\n   Congratulation!\n\tYou won!\n\t    BYE!");
		congrats.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 100));
		congrats.setTextFill(Color.GREEN);
		congratsPane.setStyle("-fx-background-color: black;");
		congratsPane.setPadding(new Insets(300, 300, 300, 300));	
		congratsPane.getChildren().add(congrats);
	}
	
	private void setGameOver(){
		gameOver.setText("\n\n\n      Game Over");
		gameOver.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 100));
		gameOver.setTextFill(Color.RED);
		gameOverPane.setStyle("-fx-background-color: black;");
		gameOverPane.setPadding(new Insets(300, 300, 300, 300));	
		gameOverPane.getChildren().add(gameOver);
	}
	
	public void showGameOver(){
		pane.setCenter(gameOverPane);
	}
	
	public void showCongrats(){
		pane.setCenter(congratsPane);
	}
	
	public void removeCongrats(){
		pane.setCenter(gameBoard);
	}
	
	
	public void setUpKeyPresses() {
		gameBoard.setOnKeyPressed(e -> {
			switch (e.getCode()) {
			case LEFT:
				game.leftPacman();
				break;
			case RIGHT:
				game.rightPacman();
				break;
			case UP:
				game.upPacman();
				break;
			case DOWN:
				game.downPacman();
				break;
			}

		});

		gameBoard.requestFocus();
	}

	private void setUpAnimation() {
		EventHandler<ActionEvent> eventHandler = (ActionEvent e) -> {
			this.pause();
			game.update();
			this.resume();
		};
		// Create an animation for alternating text
		animation = new Timeline();
		animation = new Timeline(new KeyFrame(Duration.millis(MILLISEC), eventHandler));
		animation.setCycleCount(Timeline.INDEFINITE);
		animation.play();
	}

	public static void main(String[] args) {
		System.out.println("loading...");
		Application.launch(args);
	}

	public void pause() {
		animation.pause();
	}

	public void resume() {
		animation.play();
	}


}
