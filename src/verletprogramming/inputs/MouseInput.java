/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verletprogramming.inputs;

import VerletObject.AObject;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import verletprogramming.VerletProgramming;

/**
 *
 * @author jirkazbor
 */
public class MouseInput implements MouseListener, MouseMotionListener{
    
    public VerletProgramming main;
    public boolean canMove = false;
    public int mx, my;
    public MouseInput(VerletProgramming main){
        this.main = main;
        main.addMouseListener(this);
        main.addMouseMotionListener(this);
    }
    @Override
    public void mouseClicked(MouseEvent e){
//        if(!main.handler.objects.isEmpty()){
//            for(int i=0;i<main.handler.objects.size();i++){
//                AObject object = main.handler.objects.get(i);
//                object.gravity *=-1 ;
//            }
//        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e){
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
//        mx = e.getX();
//        my = e.getY();
//        AObject o = main.handler.objects.get(7);
//        o.x = mx;
//        o.y = my;
//        o.oldx = mx;
//        o.oldy = my;
    }

    @Override
    public void mouseMoved(MouseEvent e){

    }
    
    
}
