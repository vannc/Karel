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
import edu.fcps.Digit;
public class KarelLab11 {
    
    public static void main(String[] args) {
        Display.setSize(42, 37);
        new Zero(1,9).display();
        new Zero(7,9).display();
        new Seven(13,9).display();
    }

}