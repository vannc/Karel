/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author <...>
 * @version <...>
 *
 */
 package karellab;
public class BoxTopRacer extends Racer {
	
	public BoxTopRacer(int y){
            super(y);
        }
	
    
	/**
	 * Re-implement the method to allow for jumping hurdles of any width
	 */
	@Override
	public void jumpRight() {
            int n=0;
            turnLeft();
            while(!rightIsClear()){
            move();
            n++;
            }
            turnRight();
            move();
            while(!rightIsClear()){
            move();
            }  
            turnRight();
            move();
            for(int i=1; i<n; i++){
            move();
            }
            turnLeft();	
	}

}
