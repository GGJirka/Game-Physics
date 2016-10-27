/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verletprogramming;

import VerletObject.Blocks;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferStrategy;
import VerletObject.Object;
import VerletObject.Stick;
import java.util.logging.Level;
import java.util.logging.Logger;
import verletprogramming.frame.VerletFrame;
import verletprogramming.inputs.KeyInput;
import verletprogramming.inputs.MouseInput;

/**
 *
 * @author jirkazbor
 */
public class VerletProgramming extends Canvas implements Runnable{

    private Thread mainThread;
    public Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    public double width = screenSize.width;
    public double height = screenSize.height;
    public VerletHandler handler;
    public KeyInput key;
    public MouseInput mouse;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VerletFrame frame = new VerletFrame(new VerletProgramming());
    }
    public VerletProgramming(){
        handler = new VerletHandler();
        mouse = new MouseInput(this);
        key = new KeyInput(this);
        
        //rect
        handler.objects.add(new Object(100,100,100,100));
        handler.objects.add(new Object(200,100,200,100));       
        handler.objects.add(new Object(200,200,200,200));
        handler.objects.add(new Object(100,200,100,200));
        
        //rope
//        handler.objects.add(new Object(100,0,100,0));
//        handler.objects.add(new Object(100,50,100,50));       
//        handler.objects.add(new Object(100,-50,100,-50));
//        handler.objects.add(new Object(100,-100,100,-100));
//        
//        //rope
//        handler.sticks.add(new Stick(handler.objects.get(4),handler.objects.get(0),50));
//        handler.sticks.add(new Stick(handler.objects.get(5),handler.objects.get(4),50));
//        handler.sticks.add(new Stick(handler.objects.get(6),handler.objects.get(5),50));
//        handler.sticks.add(new Stick(handler.objects.get(7),handler.objects.get(6),50));
        
        
        handler.sticks.add(new Stick(handler.objects.get(0),handler.objects.get(1),80));
        handler.sticks.add(new Stick(handler.objects.get(1),handler.objects.get(2),80));
        handler.sticks.add(new Stick(handler.objects.get(2),handler.objects.get(3),80));
        handler.sticks.add(new Stick(handler.objects.get(3),handler.objects.get(0),80));
        
        handler.sticks.add(new Stick(handler.objects.get(0),handler.objects.get(2),113));
        handler.sticks.add(new Stick(handler.objects.get(3),handler.objects.get(1),113));
        
        handler.blocks.add(new Blocks(500,200,300,20));
       /* handler.objects.add(new Object(150,100,150,100));
        handler.objects.add(new Object(200,150,200,150));  
        handler.objects.add(new Object(150,200,150,200));
        handler.objects.add(new Object(100,150,100,150));


        handler.sticks.add(new Stick(handler.objects.get(0),handler.objects.get(1),40)); 
        
        handler.sticks.add(new Stick(handler.objects.get(1),handler.objects.get(2),40));
        
        handler.sticks.add(new Stick(handler.objects.get(2),handler.objects.get(3),40));
        
        handler.sticks.add(new Stick(handler.objects.get(3),handler.objects.get(4),40));
        
        handler.sticks.add(new Stick(handler.objects.get(4),handler.objects.get(5),40));
        
        handler.sticks.add(new Stick(handler.objects.get(5),handler.objects.get(6),40));
        
        handler.sticks.add(new Stick(handler.objects.get(6),handler.objects.get(7),40));
        
        handler.sticks.add(new Stick(handler.objects.get(7),handler.objects.get(0),40));
        
        handler.sticks.add(new Stick(handler.objects.get(1),handler.objects.get(3),56));
        handler.sticks.add(new Stick(handler.objects.get(3),handler.objects.get(5),56));
        handler.sticks.add(new Stick(handler.objects.get(5),handler.objects.get(7),56));
        handler.sticks.add(new Stick(handler.objects.get(7),handler.objects.get(1),56));
        
        handler.sticks.add(new Stick(handler.objects.get(1),handler.objects.get(5),80));
        
        handler.sticks.add(new Stick(handler.objects.get(7),handler.objects.get(3),80));
        */
    }
    public void start(){
        mainThread = new Thread(this);
        mainThread.start();
    }
    @Override
    public void run() {
        while(true){
                render();
            
                handler.action();
                //handler.lineAct();
        }
    }

    private void render() {
        BufferStrategy buffer = this.getBufferStrategy();
        if(buffer == null){
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = buffer.getDrawGraphics();
        g.setColor(Color.WHITE);
        g.fillRect(0,0,(int)width,(int)height);
        handler.render(g);
        //handler.lineRender(g);
        g.dispose();
        buffer.show();
    }
}
