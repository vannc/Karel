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
import javax.swing.JOptionPane;
public class RaceLab {
    
    private static int NUMBOTS = 20;
    private static int DISTANCE = 15;
    
    public static void main(String[] args){
        NUMBOTS = Integer.parseInt(JOptionPane.showInputDialog("How many robots?"));
        DISTANCE = Integer.parseInt(JOptionPane.showInputDialog("How far is the finish?"));
        int gridsize = Math.max(NUMBOTS, DISTANCE);
        Display.setSize(gridsize, gridsize);
        Display.setSpeed(8);
        Robot[] robots = createLineup();
        runRace(robots);
    }
    
    private static Robot[] createLineup(){
        Robot[] temp = new Robot[NUMBOTS];
        for(int i = 0; i<NUMBOTS; i++){
        temp[i]= new Robot(1, 1+i,Display.EAST, 0);
        }
        return temp;
        }
    private static void runRace(Robot[] competitors){
        while(true){ //Now terminates
            int luckyRobot = (int)(Math.random()*NUMBOTS);
            competitors[luckyRobot].move();
            if(competitors[luckyRobot].getX()>DISTANCE){
            System.out.println("Robot "+luckyRobot+" won!");
            break;
            }
        }
        
    }
}
