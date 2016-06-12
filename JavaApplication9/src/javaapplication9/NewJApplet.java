/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication9;

import javax.swing.JApplet;
import javax.swing.JButton;

/**
 *
 * @author disco dancer
 */
public class NewJApplet extends JApplet {
    JButton bt;

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        bt=new JButton("sdf");
        add(bt);
        // TODO start asynchronous download of heavy resources
    }
    // TODO overwrite start(), stop() and destroy() methods
}
