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
public class Stick extends AStick{
    
    public int toX, toY;
    
    public Stick(AObject obj1, AObject obj2, double length) {
        super(obj1, obj2, length);             
    }

    @Override
    public void render(Graphics g) {
        g.drawLine((int)obj1.x+5, (int)obj1.y+5, (int)obj2.x+5, (int)obj2.y+5);
    }

    @Override
    public void updateSticks(){
        double dx = obj2.x - obj1.x;
        double dy = obj2.y - obj1.y;
        double distance = Math.sqrt(dx*dx+dy*dy);
        double difference = this.length - distance;
        double percent = difference/distance/2;
        double offsetX = dx*percent;
        double offsetY = dy*percent;
        
        obj1.x -= offsetX;
        obj1.y -= offsetY;
        obj2.y += offsetY;
        obj2.x += offsetX;
    }
    @Override
    public double distance(AObject obj1,AObject obj2){
        double dx = obj2.x-obj1.x;
        double dy = obj2.y - obj2.y;
        return Math.sqrt(dx*dx+dy*dy);
    }
}
