/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VerletObject;

/**
 *
 * @author jirkazbor
 */
public abstract class ABlocks{
    
    public int x, y, width, height;
    
    public ABlocks(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    public abstract void render(java.awt.Graphics g);
    
    public abstract java.awt.Rectangle getTop();
    
    public abstract java.awt.Rectangle getBot();
    
    public abstract java.awt.Rectangle getRight();
    
    public abstract java.awt.Rectangle getLeft();
    
}
