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
import edu.fcps.Digit;
public class One extends Digit {
    
    public One(int x, int y){
    super(x, y);
    }
    public void display(){
    segment1_Off();
    segment2_On();
    segment3_On();
    segment4_Off();
    segment5_Off();
    segment6_Off();
    segment7_Off();
    
    }
    
}

