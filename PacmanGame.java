import java.util.Random;
import javafx.scene.paint.Color;


public class PacmanGame {
private Squares allSquares = new Squares();
private Biscuits allBiscuits = new Biscuits(allSquares) ;
private Pacman pacman = new Pacman();
private Ghosts allGhosts = new Ghosts();
private PacmanGameBoard gameBoard = new PacmanGameBoard(pacman, allBiscuits, allSquares, allGhosts);
private PacmanApp app ;
private double[] hold = new double[6] ;
private int holdNumber = 0 ;


public PacmanGame(PacmanApp app){
	this.app = app ;
}

public void leftPacman(){
	movePacman(pacman.getX()-20, pacman.getY()) ;
}

public void rightPacman(){
	movePacman(pacman.getX()+20, pacman.getY()) ;
	
}
public void downPacman(){
	movePacman(pacman.getX(), pacman.getY()+20) ;	
}
public void upPacman(){
	movePacman(pacman.getX(), pacman.getY()-20) ;
}

private void movePacman(double x, double y){
	if (inGameboard(x, y)){
		pacman.move(x, y);
		eatBiscuits(x,y) ;
	}
}

public PacmanGameBoard getGameBoard(){
	initiateHold() ;
	return this.gameBoard ;
	
}

public void eatBiscuits(double x, double y){
	int[] indexes = allBiscuits.findIndex(x, y) ;
	allBiscuits.removeBiscuit(indexes[0], indexes[1]);
	if (indexes[0] != 0 && indexes[1] != 0){
		pacman.addBiscuits();
	}
}


/**
 * Method to test if Pac-man is within the game-board and not in the "walls"
 * @param x
 * @param y
 * @return test
 */
private boolean inGameboard(double x, double y){
	boolean test = false ;
	if (x < 700 && x > 100 && y < 700 && y > 100){	
		int[] indexes = allSquares.findIndex(x, y) ;
		if (allSquares.getSquares2D()[indexes[0]][indexes[1]].getStroke() !=Color.BLUE){			
			test = true ;
			}	
	}
	return test ;
	}

/**
 * This method updates the game and allow the ghosts to keep moving
 */
public void update(){
	if (allBiscuits.isEmpty() == false){
		if (pacman.getLife()!=0){
			if (holdNumber == 0){
				randomMovement(1);
				randomMovement(2);
				randomMovement(3);
				if (isInContact()){
					setHold();
					holdNumber = 20 ;
					pacman.dontMove();	
				}
			} else{
				if (holdNumber==1){
					moveGhost(1,hold[0],hold[1]);
					moveGhost(2,hold[2],hold[3]);
					moveGhost(3,hold[4],hold[5]);
					pacman.canMove();
					movePacman(300, 300);
					pacman.addPenalty(500);
					app.removeReady();
					pacman.subtractLife();
			} else if (holdNumber==9){
				moveGhost(1,hold[0],hold[1]);
				moveGhost(2,hold[2],hold[3]);
				moveGhost(3,hold[4],hold[5]);
				// Display "Ready Message"
				app.showReady();
			}
				  else if(holdNumber%2==0){
					  allGhosts.move(1, 1000, 1000);
					  allGhosts.move(2, 1000, 1000);
					  allGhosts.move(3, 1000, 1000);
				} else if (holdNumber%2==1){
					moveGhost(1,hold[0],hold[1]);
					moveGhost(2,hold[2],hold[3]);
					moveGhost(3,hold[4],hold[5]);
				}
				holdNumber--;
				
		}
			gameBoard.setMessage();
		
		}else{
			//GameOver
			app.showGameOver() ;
			pacman.dontMove();
			app.removeReady();
			
		}
		}else{
		app.showCongrats() ;
	}
		
}


/**
 * This method randomly moves Ghosts
 */
private void randomMovement(int ghostNumber){
	Random random = new Random() ;
	int num = random.nextInt(4);
	switch (num) {
	case 1:
		//LEFT
		moveGhost(ghostNumber,allGhosts.getGhost(ghostNumber).getX()-20,allGhosts.getGhost(ghostNumber).getY()) ;
		break;
	case 2:
		//RIGHT
		moveGhost(ghostNumber,allGhosts.getGhost(ghostNumber).getX()+20,allGhosts.getGhost(ghostNumber).getY()) ;
		break;
	case 3:
		// UP
		moveGhost(ghostNumber,allGhosts.getGhost(ghostNumber).getX(),allGhosts.getGhost(ghostNumber).getY()-20) ;
		break;
	case 0:
		//DOWN
		moveGhost(ghostNumber,allGhosts.getGhost(ghostNumber).getX(),allGhosts.getGhost(ghostNumber).getY()+20) ;
		break;	
	}
}
	
private void moveGhost(int ghostNumber, double x, double y){
	if (inGameboard(x,y)){
		allGhosts.move(ghostNumber, x, y);
	}	
}

/**
 * This method finds out if pacman is in contact with any of the ghosts
 * @return
 */
public boolean isInContact(){
	return allGhosts.isIntersect(pacman.getPacman().getX(), pacman.getPacman().getY()) ;
}



/**
 * This method sets the hold array
 */
private void setHold(){
	hold[0] = allGhosts.getGhost1().getX();
	hold[1] = allGhosts.getGhost1().getY();
	hold[2] = allGhosts.getGhost2().getX();
	hold[3] = allGhosts.getGhost2().getY();
	hold[4] = allGhosts.getGhost3().getX();
	hold[5] = allGhosts.getGhost3().getY();
}



private void initiateHold(){
	for (int i=0; i<hold.length; i++){
		hold[i] = 0;
	}
}

}
