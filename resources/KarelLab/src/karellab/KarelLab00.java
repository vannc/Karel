/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karellab;

/**
 *
 * @author crvann
 */
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class KarelLab00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Display.openWorld("../maps/first.map");
        Display.setSize(10, 10);
        Display.setSpeed(5);
        
        Robot karel = new Robot();
        
        karel.move();
        karel.pickBeeper();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.putBeeper();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        
    }
    
}
