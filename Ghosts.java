
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class Ghosts {
	private Image ghost1 = new Image("https://s-media-cache-ak0.pinimg.com/736x/eb/cc/bd/ebccbd1fdd901453e2854b06da8d6370.jpg");
	private ImageView view1 = new ImageView(ghost1);
	private Image ghost2 = new Image("http://www.kapoww-t-shirts.com/designs/retro/R044/R044-large.png");
	private ImageView view2 = new ImageView(ghost2);
	private Image ghost3 = new Image("http://image3.spreadshirt.com/image-server/v1/compositions/18854184/views/1,width=235,height=235,appearanceId=2/Pinky-Pacman-Ghost-Easy-Costume-1-of-4-T-Shirts.jpg");
	private ImageView view3 = new ImageView(ghost3);
	
	
	public Ghosts(){
		resize(1, 20, 20, 580, 580) ;
		resize(2, 20, 20, 140, 140) ;
		resize(3, 20, 20, 320, 400) ;
	
	}
	/**
	 * get ghosts1
	 * @return
	 */
	public ImageView getGhost1(){
		return view1 ;
	}
	
	/**
	 * get ghost2
	 * @return
	 */
	public ImageView getGhost2(){
		return view2 ;
	}
	
	/**
	 * get ghost3
	 * @return
	 */
	public ImageView getGhost3(){
		return view3 ;
	}
	
	/**
	 * This method resizes image views of the ghosts
	 * @param ghostNumber
	 * @param width
	 * @param height
	 * @param x
	 * @param y
	 */
	private void resize(int ghostNumber, int width, int height, int x, int y){
		ImageView view = getGhost(ghostNumber) ;
		view.setFitWidth(width);
		view.setFitHeight(height);
		move(ghostNumber,x,y);
	}
	
	
	/**
	 * This method changes the coordinate of the ghost
	 * @param ghostNumber
	 * @param x
	 * @param y
	 */
	public void move(int ghostNumber, double x, double y){
		ImageView view = getGhost(ghostNumber) ;
		view.setX(x);
		view.setY(y);
	}
	
	/**
	 * This method returns the specific ghost image view by number
	 * @param ghostNumber
	 * @return
	 */
	public ImageView getGhost(int ghostNumber){
		ImageView view = new ImageView();
		if (ghostNumber == 1){
			view = view1 ;
		} else if (ghostNumber == 2){
			view = view2 ;
		} else if (ghostNumber == 3){
			view = view3 ;
		} 
		return view ;
	}
	
	public boolean isIntersect(double x, double y){
		boolean test = false ;
		if (view1.getX()==x && view1.getY()== y){
			test = true ;
		}
		if (view2.getX()==x && view2.getY()== y){
			test = true ;
		}
		if (view3.getX()==x && view3.getY()== y){
			test = true ;
		}
		
		return test ;
	}
	
}


