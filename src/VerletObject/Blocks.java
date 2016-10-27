/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerletObject;

import java.awt.*;

/**
 *
 * @author jirkazbor
 */

public class Blocks extends ABlocks{

    public Blocks(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void render(Graphics g){
        g.setColor(Color.BLACK);
        g.drawRect(x,y,width,height);
        g.setColor(Color.RED);
        
        
    /*  g.drawRect(x,y,width,height/4);
        g.drawRect(x,y+(3*height/4),width,height/4);
        g.drawRect(x,y,width-(width-10),height);
        g.drawRect(x+(width-10),y,width-(width-10),height);
    */
    }

    @Override
    public Rectangle getTop() {
        return new Rectangle(x,y,width,height/4);
    }

    @Override
    public Rectangle getBot(){
        return new Rectangle(x,y+(3*height/4),width,height/4);
    }

    @Override
    public Rectangle getLeft() {
        return new Rectangle(x,y,width-(width-10),height);
    }

    @Override
    public Rectangle getRight() {
        return new Rectangle(x+(width-10),y,width-(width-10),height);
    }

   
    
    
}
