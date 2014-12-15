/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karellab;


import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class KarelLab03 {
public static void main(String[] args) {
 Display.openWorld("../maps/mountain.map");
 Display.setSize(16, 16);
 Display.setSpeed(5);
 Climber c = new Climber(8);
 Climber x = new Climber(8);
 c.putBeeper();
 c.turnRight();
 x.turnRight();
 c.move();
 x.move();
 c.climbUpRight();
 x.climbUpRight();
 c.climbUpRight();
 x.climbUpRight();
 c.climbUpRight();
 x.climbUpRight();
 c.climbDownRight();
 x.climbDownRight();
 c.turnLeft();
 x.turnLeft();
 c.climbDownRight();
 x.climbDownRight();
 c.pickBeeper();
 c.turnRight();
 x.turnRight();
 c.climbUpLeft();
 x.climbUpLeft();
 c.climbUpLeft();
 x.climbUpLeft();
 c.climbDownLeft();
 x.climbDownLeft();
 c.climbDownLeft();
 x.climbDownLeft();
 c.climbDownLeft();
 x.climbDownLeft();
 c.move();
 x.move();
 c.putBeeper();
}
}