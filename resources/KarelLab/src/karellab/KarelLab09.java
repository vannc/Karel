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
import javax.swing.JOptionPane;
public class KarelLab09 {
public static void main(String[] args) {
    String map = JOptionPane.showInputDialog("Which map?");
    Display.openWorld("../maps/"+map+".map");
    Display.setSize(10, 10);
    Athlete athena = new Athlete(1, 1, Display.EAST, 0);
    for(int i=5; i>=-1; i--){
        for(int c=0; c<=i; c++){
        athena.move();
        }
        int n=0;
        if(athena.nextToABeeper()){
            while(athena.nextToABeeper()){
                athena.pickBeeper();
                n++;
            }
            athena.move();
            for(int c=0; c<n;c++){
                athena.putBeeper();
            }
            athena.turnAround();
            athena.move();
        }else{
        athena.turnAround();
        }
        for(int c=0; c<=i; c++){
        athena.move();
        }
        athena.turnAround();
        }
    }
    //TODO write a combination of definite and indefinite loops that will cause athena
    // to pick up each pile of beepers and deposit them one square to the right.
}
