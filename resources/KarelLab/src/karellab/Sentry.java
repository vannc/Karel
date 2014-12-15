package karellab;
import org.asl.karelx.Uberbot;
import edu.fcps.karel2.Display;

/**
 * Patrols an area defined by four beepers.
 * 
 */
public class Sentry extends Uberbot {

	public Sentry(int x, int y){
        super(x, y, Display.WEST, 0);
        }
	
	/**
	 * Patrol an area in a clockwise direction.  
	 * 
	 * Move forward until next to a beeper then turn right.  Repeat indefinitely.
	 *
	 */
	public void patrol() {
		while(true){
                    while(!this.nextToABeeper()){
                    move();
                    }
                    turnRight();
                    move();
                }
	}
}
