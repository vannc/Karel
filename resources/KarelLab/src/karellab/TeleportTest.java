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
public class TeleportTest {
    
    public static void main(String[] args){
        Display.openWorld("default.map");
        Display.setSize(10, 10);
        Teleporter t = new Teleporter();
        t.teleport(4,7);
        Teleporter e = new Teleporter(2,3, 10);
        e.teleport(9, 3);
        Teleporter d = new Teleporter(2,4, 0);
        d.teleport(1, 1);
    }
}
