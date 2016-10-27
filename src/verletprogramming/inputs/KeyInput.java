/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verletprogramming.inputs;

import VerletObject.AObject;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import verletprogramming.VerletProgramming;

/**
 *
 * @author jirkazbor
 */

public class KeyInput implements KeyListener {

    public VerletProgramming main;

    public KeyInput(VerletProgramming main) {
        this.main = main;
        main.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e){
        int key = e.getKeyCode();
        AObject o1 = main.handler.objects.get(0);
        AObject o2 = main.handler.objects.get(1);
        AObject o3 = main.handler.objects.get(2);
        AObject o4 = main.handler.objects.get(3);

        switch (key) {
            case KeyEvent.VK_A:
                o1.oldx = o1.x + 5;
                o4.oldx = o4.x + 5;
                break;
                
            case KeyEvent.VK_D:
                o2.oldx = o2.x - 5;
                o3.oldx = o3.x - 5;
                break;
                
            case KeyEvent.VK_W:
                if(o1.intersects || o2.intersects || o3.intersects || o4.intersects){
                    o4.oldy = o4.y + 20;
                    o1.oldy = o1.y + 20;
                    o3.oldy = o3.y + 20;
                    o4.oldy = o4.y + 20;
                }
            break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
