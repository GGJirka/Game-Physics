/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verletprogramming.frame;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import verletprogramming.VerletProgramming;

/**
 *
 * @author jirkazbor
 */
public class VerletFrame {
    
    public JFrame frame;
    
    public VerletProgramming main;
    
    public VerletFrame(VerletProgramming main){
        this.main = main;
        frame = new JFrame("Verlet programming test");
        frame.setSize(1650,1080);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.add(main);
        main.start();
    }
}
