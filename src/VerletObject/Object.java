/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerletObject;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 *
 * @author jirkazbor
 */
public class Object extends AObject{
        
    public Object(double x, double y, double oldx, double oldy){
        super(x, y,oldx, oldy);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillOval((int)x,(int)y,10,10);
    }

    @Override
    public void action(){
        // 100x 100y 110oldx 100oldy
        vx = (x - oldx)*energy;
        vy = (y - oldy)*energy;
        // 
        oldx = x;
        oldy = y;
        
        x += vx;
        y += vy;
        y += gravity;
        
        if(x>width){
            x = width;
            oldx = x+vx*bounce;
        }else if(x<0){
            x = 0;
            oldx = x+vx*bounce;
        }
        if(y>=height-75){
            intersects = true;
            y = height-75;
            oldy = y+vy*bounce;
        }else{
            intersects = false;
        }
        if(y<0){
            y = 0;
            oldy = y+vy*bounce;
        }
    }    
    @Override
    public  Rectangle rect(){
        return new Rectangle((int)x,(int)y,10,10);
    }
}
