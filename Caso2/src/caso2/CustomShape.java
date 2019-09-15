/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;
import sun.awt.RepaintArea;

/**
 *
 * @author kduran
 */
class CustomShape {

    private static final int Y_STEP = 5;
    private static final int X_STEP = 5;
    public String name;
    public Shape shape;
    public Color color;
    private Point newLocation;

    public void move() {
//        System.out.println("x " + newLocation.x + " y " + newLocation.y);
        newLocation.x += X_STEP;
        newLocation.y += Y_STEP;
//        System.out.println("x " + newLocation.x + " y " + newLocation.y);
        //How set new location ?
        //It doesn't work
////        this.shape.getBounds().setLocation(new Point(newLocation.x, newLocation.y));        
//        System.out.println(String.format("New location is [%d,%d]",newLocation.x, newLocation.y));
//        System.out.println(String.format("Move to [%d,%d]", this.shape.getBounds().getLocation().x, this.shape.getBounds().getLocation().y));       
        
    }

    public CustomShape(Shape shape, Color color, String name) {
        this.shape = shape;
        this.color = color;
        this.name = name;
        newLocation = this.shape.getBounds().getLocation();
    }

    public Shape getShape() {
        return shape;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Point getNewLocation() {
        return newLocation;
    }

    public void setNewLocation(Point newLocation) {
        this.newLocation = newLocation;
    }
    
}
