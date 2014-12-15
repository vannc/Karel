package karellab;

import edu.fcps.karel2.Display;
import org.asl.karelx.Wanderer;

/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
public class TestChallenge2 {
	// TODO Complete the Horse class, provided

	public static void main(String[] args) {
            Display.openWorld("../maps/pasture.map");
            Display.setSize(15, 15);
            Display.setSpeed(10);
            Horse h = new Horse(5,5);
            h.wander(36,7);
            h.explode();
		// TODO Load the "pasture" map at size 15 by 15
		// TODO Create an instance of a Horse inside the pasture
		// TODO Have the horse wander for 36 steps with a timer of 7
		// TODO Have the horse explode()
	}

}
