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
public class KarelLab01 {
    
    public static void main(String[] args) {
        Display.openWorld("../maps/school.map");
        Display.setSize(10, 10);
        Display.setSpeed(5);
        
        Robot lisa = new Robot();
        Robot pete = new Robot(4, 5, Display.SOUTH, 0);
        
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.pickBeeper();
        lisa.turnLeft();
        lisa.turnLeft();
        lisa.move();
        lisa.turnLeft();
        lisa.turnLeft();
        lisa.turnLeft();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.move();
        lisa.move();
        lisa.turnLeft();
        lisa.turnLeft();
        lisa.turnLeft();
        lisa.move();
        lisa.putBeeper();
        pete.pickBeeper();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.turnLeft();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.turnLeft();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.turnLeft();
        pete.move();
        pete.move();
        pete.putBeeper();
        pete.turnLeft();
        pete.turnLeft();
        pete.move();
        
    }
}
