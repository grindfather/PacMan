import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Squares {
	private static final int SIZE = 20 ;
	private static final int NUM = 30 ;
	private static final int X_COORDINATE = 100;
	private static final int Y_COORDINATE = 100;
	private static Rectangle[][] squares2D = new Rectangle[NUM][NUM];
	
	/**
	 * Constructor
	 */
	public Squares(){
		populateSquares() ;
	}
	
	/**
	 * This method populates squares
	 */
	public void populateSquares(){
		
		// Fill up the rest of the array with Black Rectangles
    	for (int i = 0; i < NUM; i++){
    		for (int j = 0; j < NUM; j++){
    			if (squares2D[i][j] == null){
    				squares2D[i][j] = new Rectangle(X_COORDINATE+(i*SIZE),Y_COORDINATE+(j*SIZE),SIZE,SIZE) ;
    			}
    			
    		}
    	}
    	
    	// Design for the "walls" (maze)
    	setWallSides() ;
    	hardcodeWalls() ;
    	
    }
	
	/**
	 * This method returns the 2D array of the all the squares
	 * @return squares2D
	 */
	public Rectangle[][] getSquares2D(){
		return squares2D ;
	}
	
	
	/**
	 * This method sets all four sides of the wall
	 */
	public void setWallSides(){
		for (int i= 1; i < NUM-1; i++){
			// Set top sides
			squares2D[1][i].setStroke(Color.BLUE);
			// Set bottom sides
			squares2D[NUM-2][i].setStroke(Color.BLUE);
			// Set right sides
			squares2D[i][1].setStroke(Color.BLUE);
			// Set left sides
			squares2D[i][NUM-2].setStroke(Color.BLUE);
		}
		
	}
	
	
	/**
	 * This method returns the indexes by looking at x and y coordinates
	 * @return indexes
	 */
	public int[] findIndex(double x, double y){
		int[] indexes = new int[2] ;
		for (int i = 0; i < NUM; i++){
    		for (int j = 0; j < NUM; j++){
    			if (squares2D[i][j].getX() == x && squares2D[i][j].getY() == y){
    				indexes[0] = i ;
    				indexes[1] = j ;
    			}		
    		}
    	}
		return indexes ;
	} 
	
	/**
	 * Hardcode the "walls" (maze)
	 */
	public void hardcodeWalls(){
		int numberx = 3 ;
		int numbery = 3 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 13 ;
		numbery = 3 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	
    	
    	numberx = 21 ;
		numbery = 3 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 3 ;
		numbery = 9 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 3 ;
		numbery = 15 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 21 ;
		numbery = 9 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	
    	numberx = 21 ;
		numbery = 15 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 13 ;
		numbery = 9 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 13 ;
		numbery = 15 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 3 ;
		numbery = 21 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 13 ;
		numbery = 21 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	numberx = 21 ;
		numbery = 21 ;
		squares2D[numberx][numbery].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+1][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+2][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+2].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+1].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+3][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+3].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+4].setStroke(Color.BLUE);
    	squares2D[numberx+5][numbery+1].setStroke(Color.BLUE);
    	
    	
	}
}
