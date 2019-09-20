/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JPanel;

/**
 *
 * @author kduran
 */
public class DrawThread implements Runnable {
    private int THREAD_SLEEP;
    private Bola shape;
    private Graphics2D g2d;
    private boolean interrupted = false;
    private JPanel jPanel;
    
    public DrawThread(Bola shape, Graphics g, int time) {
        this.shape = shape;
        this.g2d = (Graphics2D)g;
        THREAD_SLEEP = time;
    }
    
    public void setJPanel (JPanel jPanel){
        this.jPanel = jPanel;
    }
    
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(THREAD_SLEEP);
                g2d.setColor(shape.getColor());
                shape.move();
                g2d.draw(shape.getCircle());
            } catch (InterruptedException e) {
                System.out.println(String.format("interrupt %s", Thread
                        .currentThread().getName()));
                interrupted = true;
            } finally {
                if (interrupted)
                    break;
                }
        }
    }
}
