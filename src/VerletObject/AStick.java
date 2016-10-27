/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerletObject;

import java.awt.Graphics;

/**
 *
 * @author jirkazbor
 */
public abstract class AStick {
    
    public AObject obj1;
    public AObject obj2;
    
    public double length;

    public AStick(AObject obj1, AObject obj2,double length) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.length = length;
    }
        
    public abstract void render(Graphics g);
    
    public abstract void updateSticks();
    
    public abstract double distance(AObject obj1,AObject obj2);
}
