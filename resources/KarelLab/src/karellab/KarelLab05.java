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
public class KarelLab05 {
    
    public static void runTheRace(Racer r){
    
    r.shuttle(2,7);
    r.shuttle(4, 5);
    r.shuttle(6, 3);
        
    }
    
    public static void main(String[] args) {
        Display.openWorld("../maps/shuttle.map");
        Display.setSize(10, 10);
        Display.setSpeed(5);

        Racer a = new Racer(1);
        Racer b = new Racer(4);
        Racer c = new Racer(7);
        runTheRace(a);
        a.move();
        runTheRace(b);
        b.move();
        runTheRace(c);
        c.move();
    }
}