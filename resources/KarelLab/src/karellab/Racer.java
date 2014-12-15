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
public class Racer extends Athlete {
public Racer(int y) {
super(1, y, Display.EAST, Display.INFINITY);
}
public void jumpRight() {
    Display.setSpeed(10);
    turnLeft();
    move();
    turnRight();
    move();
    turnRight();
    move();
    turnLeft();
    Display.setSpeed(5);
}
public void jumpLeft() {
    Display.setSpeed(10);
    turnRight();
    move();
    turnLeft();
    move();
    turnLeft();
    move();
    turnRight();
    Display.setSpeed(5);
}
public void sprint(int n) {
    Display.setSpeed(10);
    for (int k = 1; k<=n; k++) {
        move();
    }
    Display.setSpeed(5);
}
public void put(int n) {
    for (int i = 1; i<=n; i++) {
        putBeeper();
    }
}
public void pick(int n) {
    for (int i = 1; i<=n; i++) {
      pickBeeper();
    }
}
/**
* Racers shuttle by moving forward, jumping any hurdles along the way, and collecting
* the required number of beepers. Racers then return to their starting position and
* deposit the collected beepers. Finally, Racers face East to complete the shuttle.
*
* @param spaces
* @param beepers
*/
public void shuttle(int spaces, int beepers) {
    Display.setSpeed(10);
    move();
    jumpRight();
    sprint(spaces);
    pick(beepers);
    turnAround();
    sprint(spaces);
    jumpLeft();
    move();
    put(beepers);
    turnAround();
    Display.setSpeed(5);
}
}