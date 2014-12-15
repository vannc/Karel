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

public class Teleporter extends Athlete{
    
    public Teleporter(){
        super(1, 1, Display.WEST, Display.INFINITY);     
    }
    
    public Teleporter(int x, int y, int beeper){
        super(x, y, Display.WEST, beeper);
    }
    
    public void teleport(int x, int y){
        if(hasBeepers()){
         this.x=x;
         this.y=y;
         this.putBeeper();
        }else{
        explode();
        }
    }
    
    
}
