package karellab;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author crvann
 */
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;
public class KarelLab10 {

public static void main(String[] args) {
String map = JOptionPane.showInputDialog("Which map?");
    Display.openWorld("../maps/"+map+".map");
    Display.setSize(10, 10);
Athlete athena = new Athlete(1, 1, Display.NORTH, Display.INFINITY);
clearMaze(athena);
}
public static void clearMaze(Athlete arg) {
    boolean beeper=false;
    check(arg);

}
public static void check(Athlete a){
    int n = 0;
    while((a.frontIsClear()&&!a.leftIsClear()&&!a.rightIsClear())&&!a.nextToABeeper()){
        a.putBeeper();
        a.move();
        n++;
    }
    if(a.nextToABeeper()){
        return;
    }else if(a.frontIsClear()&&a.rightIsClear()&&a.leftIsClear()){ //all are clear
        a.turnRight();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()&&a.frontIsClear()){
            a.move();
            if(a.nextToABeeper()){
            return;
            }else{
            a.turnAround();
            a.move();
            a.turnAround();
            }
        }
        a.move();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnLeft();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.pickBeeper();
    }else if(a.rightIsClear()&&a.leftIsClear()&&!a.frontIsClear()){ //right and left only are clear
        a.turnRight();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnRight();
        a.pickBeeper();
    }else if(a.rightIsClear()&&!a.leftIsClear()&&a.frontIsClear()){ //right and front only are clear
        a.turnRight();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnRight();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.pickBeeper();
    }else if(!a.rightIsClear()&&a.leftIsClear()&&a.frontIsClear()){ //front and left only are clear
        a.turnLeft();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnLeft();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.pickBeeper();
    }else if(a.rightIsClear()&&!a.leftIsClear()&&!a.frontIsClear()){ //only right is clear
        a.turnRight();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnLeft();
        a.pickBeeper();
    }else if(!a.rightIsClear()&&a.leftIsClear()&&!a.frontIsClear()){ //only left is clear
        a.turnLeft();
        a.putBeeper();
        a.move();
        check(a);
        if(a.nextToABeeper()){
            return;
        }
        a.move();
        a.turnRight();
        a.pickBeeper();
    }else{
    a.turnAround();
    } 
           //none are clear
         for(int i=0; i<(n); i++){
             a.move();
             a.pickBeeper();
         }
    
}
    
}