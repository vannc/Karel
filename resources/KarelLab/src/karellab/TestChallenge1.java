


/**
 * Read and implement all of the TODO items in the main method, below.
 * 
 */
package karellab;
import org.asl.karelx.Squarebot;
import edu.fcps.karel2.Display;
public class TestChallenge1 {

	public static void main(String[] args) {
            Display.openWorld("");
            Display.setSize(10, 10);
            Display.setSpeed(7);
            Squarebot s = new Squarebot(9,3);
            s.layCorners(5);
            Sentry sentry = new Sentry(9,3);
            sentry.move();
            sentry.patrol();
	}

}
