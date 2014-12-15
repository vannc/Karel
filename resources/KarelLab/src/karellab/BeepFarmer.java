package karellab;
import org.asl.karelx.Farmer;

/**
 * Represents a farmer capable of sowing or reaping beepers from a rectangular garden
 *
 */
public class BeepFarmer extends Farmer {

	//  TODO Add one or more constructors, as needed
	public BeepFarmer(){
        super();
        }
	/**
	 * Access all locations in a rectangular garden and pick up any beepers found
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be harvested.
	 * 
	 * @param width			the width of the garden (number of columns)
	 * @param height		the height of the garden (number of rows)
	 * 
	 * Ex. reap(7, 4) should gather all beepers from an area 7 rows wide and 4 rows tall
	 */
        @Override
	public void reap(int width, int height) {
            int startx=getX();
            int starty=this.getY();
            int x=getX();
            int y=getY();
            for(int column=0; (width)>column; column++){
                while(this.nextToABeeper()){
                    pickBeeper();
                    }
                for(int row =0; (height)>row; row++){
                    while(this.nextToABeeper()){
                    pickBeeper();
                    }
                    y++;
                    if(y>=(starty+height)){
                    break;
                    }
                    teleport(x,y);
                }
                y=starty;
                x++;
                if(x>=(startx+width)){
                    teleport(1,1);
                    while(hasBeepers()){
                    putBeeper();
                    }
                }else{
                teleport((x),y);
                }
            }
            this.sideStepRight();
	}
	
	/**
	 * Access all locations in a rectangular garden and plant one beeper at each location
	 * 
	 * Precondition: Farmer is starting in the southwest corner of the area to be sown.
	 * 
	 * @param width		the width of the garden (number of columns)
	 * @param height	the height of the garden (number of rows)
	 */
        @Override
	public void sow(int width, int height) {
		int startX = this.getX();
		int startY = this.getY();
		for (int i = 0; i< width; i++) {
			for (int j = 0; j<height; j++) {
				teleport(startX+i, startY+j);
				if (this.hasBeepers()) {
					putBeeper();
				}
			}
		}
	}
}
