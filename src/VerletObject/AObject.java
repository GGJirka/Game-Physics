/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerletObject;

import java.awt.Toolkit;

/**
 *
 * @author jirkazbor
 */
public abstract class AObject {
    
    public double x, y; // x position y position
    
    public double oldx, oldy;// old x position old y position
    
    public double vx,vy;
    
    public double bounce=1;
    
    public double gravity=0.5;
    
    public double energy = 0.998;
    
    public boolean intersects;
    
    public double width = Toolkit.getDefaultToolkit().getScreenSize().width;
    
    public double height = Toolkit.getDefaultToolkit().getScreenSize().height;
    
    public AObject(double x, double y, double oldx, double oldy) {
        this.x = x;
        this.y = y;
        this.oldx = oldx;
        this.oldy = oldy;
    }
    
    public abstract void render(java.awt.Graphics g);
    
    public abstract void action();
    
    public abstract java.awt.Rectangle rect();
 
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getOldx() {
        return oldx;
    }

    public void setOldx(double oldx) {
        this.oldx = oldx;
    }

    public double getOldy() {
        return oldy;
    }

    public void setOldy(double oldy) {
        this.oldy = oldy;
    }

    public double getBounce() {
        return bounce;
    }

    public void setBounce(double bounce) {
        this.bounce = bounce;
    }

    public double getGravity() {
        return gravity;
    }

    public void setGravity(double gravity) {
        this.gravity = gravity;
    }
    
    
}
