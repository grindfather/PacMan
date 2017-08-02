import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Biscuits {
	private Squares allSquares ; 
	private static final int RADIUS = 2 ;
	private static final int NUM = 26 ;
	private static Circle[][] biscuits2D = new Circle[NUM+4][NUM+4];
	
	/**
	 * Constructor
	 */
	public Biscuits( Squares allSquares){
		this.allSquares = allSquares ;
		populateBiscuits() ;
	}
	
	/**
	 * This method populates biscuits
	 */
	public void populateBiscuits(){
		
		// Fill up the the array with Biscuits if it does not contain a "wall"
    	for (int i = 2; i < NUM+2; i++){
    		for (int j = 2; j < NUM+2; j++){
    			if (allSquares.getSquares2D()[i][j].getStroke() != Color.BLUE){
    				double x = allSquares.getSquares2D()[i][j].getX() ;
    				double y = allSquares.getSquares2D()[i][j].getY() ;
    				biscuits2D[i][j] = new Circle(x+10, y+10, RADIUS, Color.DARKCYAN) ;
    			}		
    		}
    	}	
    }	
	/**
	 * This method returns the 2D array of the all the biscuits
	 * @return biscuits2D
	 */
	public Circle[][] getBiscuits2D(){
		return biscuits2D ;
	} 
	
	/**
	 * This method returns the indexes by looking at x and y coordinates
	 * @return biscuits2D
	 */
	public int[] findIndex(double x, double y){
		int[] indexes = new int[2] ;
		for (int i = 0; i < NUM+4; i++){
    		for (int j = 0; j < NUM+4; j++){
    			if (biscuits2D[i][j] != null && biscuits2D[i][j].getCenterX() == x+10 && biscuits2D[i][j].getCenterY() == y+10){
    				indexes[0] = i ;
    				indexes[1] = j ;
    			}		
    		}
    	}
		return indexes ;
	} 
	
	/**
	 * This method removes the cirlce in the biscuit array
	 * @param x
	 * @param y
	 */
	public void removeBiscuit(int x, int y){
		if (biscuits2D[x][y] != null){
			biscuits2D[x][y].setFill(Color.BLACK);
			biscuits2D[x][y] = null ;
		}
	}
	
	/**
	 * This method finds out if there are any biscuits left or not
	 * @return
	 */
	public boolean isEmpty(){
		boolean isEmpty = true ;
		for (int i = 0; i < NUM+4; i++){
    		for (int j = 0; j < NUM+4; j++){
    			if (biscuits2D[i][j]!=null && isEmpty == true ){
    						isEmpty = false ;
    					}
    		}
    	}
		return isEmpty ;
	}
	
}
