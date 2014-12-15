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
public class RaceLabC {
    public static void main(String[] args){
        Display.setSize(20, 20);
        Display.setSpeed(8);
        Robot[] robots = new Robot[5];
        for(int i = 0; i<5; i++){
        robots[i]= new Robot(1, 1+i,Display.EAST, 0);
        }
        while(true){ //Still no terminating condition
            int luckyRobot = (int)(Math.random()*5);
            robots[luckyRobot].move();
        }
        
    }
}
