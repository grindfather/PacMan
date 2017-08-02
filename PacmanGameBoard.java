import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class PacmanGameBoard extends Pane{
	private Squares allSquares;
	private Pacman pacman ;
	private Biscuits allbiscuits ;
	private Ghosts allGhosts ;
	private Label score = new Label() ;
	
	

    /**
     * Constructor
     */
    public PacmanGameBoard(Pacman pacman, Biscuits allbiscuits, Squares allSquares, Ghosts allGhosts){
    	this.pacman = pacman ;
    	this.allbiscuits = allbiscuits ;
    	this.allSquares = allSquares ;
    	this.allGhosts = allGhosts ;
    	
    	//Create Label to display message
    	score.setFont(Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30));
    	score.setTextFill(Color.GREEN);
    	//Create HBox to display score
    	Pane scorePane = new HBox() ;
    	scorePane.setPrefHeight(100);
    	scorePane.setPadding(new Insets(50, 350, 50, 130));	
    	scorePane.getChildren().add(score);
    	this.getChildren().add(scorePane);
    	
    	// Add squares to the GameBoard
    	for (Rectangle[] squares1D: this.allSquares.getSquares2D()){
    		for (Rectangle square: squares1D)
    		this.getChildren().add(square);
    	}
    	
    	// Add Biscuits to GameBoard
    	for (Circle[] biscuits1D: this.allbiscuits.getBiscuits2D()){
    		for (Circle biscuit: biscuits1D){
    			if (biscuit!= null){
    				this.getChildren().add(biscuit);
    			}
    		}  		
    	}  
    	// Add Pac-man to GameBoard
    	this.getChildren().add(this.pacman.getPacman());
    	// Add Ghosts to GameBoard
    	this.getChildren().add(this.allGhosts.getGhost1()) ;
    	this.getChildren().add(this.allGhosts.getGhost2()) ;
    	this.getChildren().add(this.allGhosts.getGhost3()) ;
    }
    
    /**
     * Method to change the score 
     * @param num
     */
    public void setMessage(){	
    	score.setText("Score: " + (pacman.getNumberOfBiscuits()*20 - pacman.getPenalty()) +  "\t\t\t\t\t\t" + "Life: " + (pacman.getLife()));
    }
    
}


