/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karellab;

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;


/**
 *
 * @author crvann
 */
public class KarelLab02 {
    public static void main(String[] args) {
        Display.openWorld("../maps/maze.map");
        Display.setSize(8, 8);
        Display.setSpeed(5);
        
        Athlete a = new Athlete();
        
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.turnRight();
        a.move();
        a.putBeeper();
        a.turnRight();
        a.move();
        a.putBeeper();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.turnRight();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.turnRight();
        a.move();
        a.putBeeper();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.turnLeft();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.move();
        a.putBeeper();
        a.turnRight();
        a.move();
        a.putBeeper();
        a.move();
        
    }
}
