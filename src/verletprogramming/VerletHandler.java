/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verletprogramming;

import VerletObject.ABlocks;
import VerletObject.AObject;
import VerletObject.AStick;
import java.util.LinkedList;

/**
 *
 * @author jirkazbor
 */
public class VerletHandler {
    
    public LinkedList<AObject> objects;
    public LinkedList<AStick> sticks;
    public LinkedList<ABlocks> blocks;
    
    public VerletHandler(){
        objects = new LinkedList<>();
        sticks = new LinkedList<>();
        blocks = new LinkedList<>();
    }

    public void render(java.awt.Graphics g) {
        objects.stream().forEach((o) -> {
            o.render(g);
        });
        sticks.stream().forEach((s) -> {
            s.render(g);
        });
        blocks.stream().forEach((b) ->{
            b.render(g);
        });
        for(int i=0;i<objects.size();i++){
            AObject o = objects.get(i);
            g.drawString("p"+(i+1), (int)o.x+5, (int)o.y-5);
        }
    }

    public void action() {
        objects.stream().forEach((o) -> {
            o.action();
        });
        sticks.stream().forEach((s) -> {
            s.updateSticks();
        });
        for(ABlocks b : blocks){
            for(AObject o : objects){
                if(o.rect().intersects(b.getBot())){
                    o.y = b.getBot().y+b.getBot().height;
                    o.oldy = o.y+o.vy*o.bounce;
                }
            }
        }
    }
    public void setLength(){
        for(AStick stick:sticks){
            stick.length = stick.distance(stick.obj1, stick.obj2);
        }
    }
}
