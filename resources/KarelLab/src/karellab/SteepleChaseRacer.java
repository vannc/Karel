/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author <...>
 * @version <...>
 *
 */
 package karellab;
public class SteepleChaseRacer extends Racer {
	
        public SteepleChaseRacer(int y){
        super(y);
        }
	
	/**
	 * Re-implement the method to allow for jumping hurdles of any height
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
            turnRight();
            move();
            for(int i=1; i<n; i++){
            move();
            }
            turnLeft();	
	}

}
