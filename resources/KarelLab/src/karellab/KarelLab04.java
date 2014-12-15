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
import edu.fcps.karel2.Robot;
public class KarelLab04 {
public static void takeTheField(Athlete arg) {
    arg.move();
    arg.move();
    arg.move();
    arg.move();
    arg.turnRight();
    arg.move();
    arg.move();
}
public static void main(String[] args) {
 Display.openWorld("../maps/arena.map");
 Display.setSize(10, 10);
 Display.setSpeed(5);
 Athlete a = new Athlete();
 Athlete b = new Athlete();
 Athlete c = new Athlete();
 Athlete d = new Athlete();
 Athlete e = new Athlete();
 Athlete f = new Athlete();
 Athlete coach = new Athlete();
 takeTheField(a);
 takeTheField(b);
 takeTheField(c);
 takeTheField(d);
 takeTheField(e);
 takeTheField(f);
 takeTheField(coach);
 a.move();
 a.move();
 a.move();
 a.move();
 a.turnRight();
 b.move();
 b.move();
 b.move();
 b.turnRight();
 c.move();
 c.move();
 c.turnRight();
 d.move();
 d.move();
 d.move();
 d.move();
 d.move();
 d.turnLeft();
 d.move();
 d.turnAround();
 e.move();
 e.turnLeft();
 e.move();
 e.turnAround();
 f.move();
 f.move();
 f.move();
 f.turnLeft();
 f.move();
 f.move();
 f.turnAround();
 coach.turnAround();
 coach.move();
 coach.turnRight();
 coach.move();
 coach.move();
 coach.turnRight();
}
}
