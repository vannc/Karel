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
public class Athlete extends Robot{
 
    public Athlete(){
    super(1, 1, Display.NORTH, Display.INFINITY); 
}

public Athlete(int x, int y, int dir, int beep){
super(x, y, dir, beep);
}

public void turnAround(){
    Display.setSpeed(10);
    this.turnLeft();
    this.turnLeft();
    Display.setSpeed(5);
    
}
public void turnRight(){
    
    Display.setSpeed(10);
    this.turnLeft();
    this.turnLeft();
    this.turnLeft();
    Display.setSpeed(5);

}

}
