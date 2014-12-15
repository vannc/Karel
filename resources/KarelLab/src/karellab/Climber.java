    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    package karellab;

    /**
    * A Climber is an Athlete that can also climb up to the right
    * and left as well as climb down to the right and left.
    *
    * By default, climbers are constructed as athletes; however,
    * they can also be constructed using a single argument representing
    * the initial x location; in this case, they begin at the
    * location (x,0), facing North, with exactly one beeper.
    *
    * @author <...>
    * @version <...>
    *
    */
    import edu.fcps.karel2.Display;
    public class Climber extends Athlete {
    public Climber() {
    super();
    }
    public Climber(int x) {
    super(x, 1, Display.NORTH, 1);
    }
    public void climbUpRight() {
        Display.setSpeed(10);
        turnLeft();
        move();
        move();
        turnRight();
        move();
        Display.setSpeed(5);
    }
    public void climbUpLeft() {
        Display.setSpeed(10);
        turnRight();
        move();
        move();
        turnLeft();
        move();
        Display.setSpeed(5);
    }
    public void climbDownRight() {
        Display.setSpeed(10);
        move();
        turnRight();
        move();
        move();
        turnLeft();
        Display.setSpeed(5);
    }
    public void climbDownLeft() {
        Display.setSpeed(10);
        move();
        turnLeft();
        move();
        move();
        turnRight();
        Display.setSpeed(5);
        
    }
    }