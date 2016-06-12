/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import java.util.Random;

/**
 *
 * @author hp
 */
public class Randominteger {
    
    public int generaterandom()
    {
        Random randomgen=new Random();
        int randomint=randomgen.nextInt(6);
        int generated=randomint+1;
        return generated;
         }
}
