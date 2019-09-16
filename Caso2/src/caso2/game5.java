/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
 
import javax.swing.*;
import javax.swing.border.Border;
 
public class game5 extends JPanel implements ActionListener{
    Timer tm=new Timer(1200, this);
    Random ra=new Random();
    int angle=0;
    Rectangle rec;
    boolean dr=false;
    int frX=0;
    int frY=0;
    int frEndX=0;
    int frEndY=0;
    int dirX=300;
    int dirY=300;
    int val=1;
    JFrame frame; 
    public game5(JFrame frame){
        this.setSize(420, 420);
        this.setBorder(BorderFactory.createEmptyBorder(300, 100, 330, 110));
        this.frame = frame;
        this.setBackground(Color.CYAN);
        rec=new Rectangle();
        rec.x=350;
        rec.y=350;
        rec.height=20;
        rec.width=20;
    }
//    public static void main(String[] args){
//        game5 ga=new game5();
//        ga.drawing();
//    }
    
    public void drawing(){
//        JFrame frame=new JFrame();
//        frame.setSize(424, 399);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//        frame.add(this);
//        frame.setVisible(true);
        System.out.println("siiiii");
        frame.add(this);
        frX=48;
        frY=141;
        frEndX=48+424;
        frEndY=141+399;
        
    }
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D gd=(Graphics2D) g;
        gd.setColor(Color.orange);
        gd.fill(rec);
        tm.start();
         
    }
    @Override
    public void actionPerformed(ActionEvent arg0) {
        while(true){
            rec.x = rec.x+2;
            rec.y = rec.y+2;
            System.out.println("");
            repaint();
        }
    }
}