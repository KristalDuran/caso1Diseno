/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class ViewPanel extends JPanel {
    private static final long serialVersionUID = 5252479726227082794L;
    private ArrayList<Bola> shapeList = new ArrayList<Bola>();
    private Map<String, Thread> threads = new HashMap<String, Thread>();
    private Timer timer;
    private static final int TIMER_SPEED = 1000;
    JFrame jFrame;
    
    public ViewPanel() {
        
        super();
        setLayout(null);
        this.setSize(420, 420);
        this.setBounds(80, 130, 400, 400);
//        this.frame = frame;
        this.setBackground(Color.CYAN);
        this.setDoubleBuffered(true);
        timer = new Timer(TIMER_SPEED, null);
        timer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                testMove();
            }
        });
    }
    private void testMove() {
        for (Bola shape : shapeList) {
            System.out.println("movi");
            shape.move();
            repaint();
        }
    }

    public void startMove() {
        timer.start();
    }

    public void stopMove() {
        timer.stop();
    }

    public void addShape(Bola shape,int time) {
        shapeList.add(shape);
        DrawThread drawing = new  DrawThread(shape, this.getGraphics(), time);
        Thread t = new Thread(drawing, shape.getName());
        t.start();
        this.repaint();
    }

    public void removeShape(Bola shape) {
        if (threads.containsKey(shape.getName())) {
            Thread t = threads.remove(shape.getName());
            t.interrupt();
            shapeList.remove(shape);
        }
        this.repaint();
    }
    
    public void setFrame (JFrame jFrame){
        this.jFrame = jFrame;
        this.jFrame.add(this);
    }
}