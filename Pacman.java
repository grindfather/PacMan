import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Pacman {
	private Image pacmanImage = new Image("http://intelligent.mit.edu/workshop_light/john/L5-PacManExercise/Code/PacMan1.png");
	private ImageView pacman = new ImageView(pacmanImage);
	private int numberOfBiscuits = 0 ;
	private boolean allowToMove = true ;
	private int penalty = 0;
	private int life = 3 ;
	
	public Pacman(){	
		pacman.setFitWidth(20);
		pacman.setFitHeight(20);
		pacman.setX(300);
		pacman.setY(300);
	}
	
	
	public void dontMove(){
		allowToMove = false ;
	}
	
	public void canMove(){
		allowToMove = true ;
	}
	
	
	public ImageView getPacman(){
		return pacman ;
	}
	
	public void move(double x, double y){
		if (allowToMove){
			pacman.setX(x);
			pacman.setY(y);
		}			
		}
	
	public double getX(){
		return pacman.getX() ;
		}
	
	public double getY(){
		return pacman.getY() ;
		}
	
	/**
	 * add one to number of Biscuits
	 */
	public void addBiscuits(){
		numberOfBiscuits++ ;
	}
	
	/**
	 * get number of biscuits
	 * @return numberOfBiscuits
	 */
	public int getNumberOfBiscuits(){
		return numberOfBiscuits ;
	}
	
	/**
	 * get Penalty
	 * @return numberOfBiscuits
	 */
	public int getPenalty(){
		return penalty ;
	}
	
	/**
	 * Increase penalty number
	 * @param num
	 */
	public void addPenalty(int num){
		penalty= penalty + num ;
	}
	
	public int getLife(){
		return life ;
	}
	
	public void subtractLife(){
		life-- ;
	}
	
	
}
