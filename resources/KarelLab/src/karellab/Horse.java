package karellab;
import org.asl.karelx.Wanderer;

/**
 * Represents a horse wandering around aimlessly in a pasture
 *
 */
public class Horse extends Wanderer {

	public Horse(int x, int y){
        super(x,y);
        }
	
	/**
	 * Wander around in random directions until a specified number of steps have been taken.
	 * At regular intervals specified by timer, drop a beeper.
	 * 
	 * @param count		the total number of steps to take
	 * @param timer		the interval at which to drop a beeper
	 * 
	 * Ex. horse.wander(13, 4) should drop a beeper every four steps until thirteen steps are taken
	 */
	public void wander(int count, int timer) {
            int steps=0;
            while(steps<count){
                int time=0;
                while(time<timer){
                int dir = (int) (Math.random() * 3);
                if(dir==0&&frontIsClear()){
                move();
                }else if(dir==1){
                 turnRight();
                 if(frontIsClear()){
                 move();
                 }else if(backIsClear()){
                 turnAround();
                 move();
                 }else{
                 turnLeft();
                 turnAround();
                 move();
                 }
                }else if(dir==2){
                 turnLeft();
                 if(frontIsClear()){
                 move();
                 }else if(backIsClear()){
                 turnAround();
                 move();
                 }else{
                 turnRight();
                 turnAround();
                 move();
                 }
                }else{
                turnAround();
                move();
                }
                steps++;
                System.out.println(steps);
                time++; 
                System.out.println(time);
                if(steps>=count){
                break;
                }
                
            }
            time=0;
            putBeeper();
	}
    }
}
