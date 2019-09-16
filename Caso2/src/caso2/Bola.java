/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author kduran
 */
public class Bola implements IPrototype<Bola>{
    private Color color;
    private int direccion;
    private int velocidad;
    private static final int Y_STEP = 5;
    private static final int X_STEP = 5;
    int x = (int)(Math.random()*389 + 1);
    int y = (int)(Math.random()*389 + 1);
    private String name = ""+x;
    private Shape circle = new Ellipse2D.Double(x, y, 5, 5);
    private Point newLocation = new Point(x, y);
    
    public Bola(Color color, int direccion, int velocidad) {
        this.color = color;
        this.direccion = direccion;
        this.velocidad = velocidad;
        
    }

    public void move() {
        newLocation.x += X_STEP;
        newLocation.y += Y_STEP;
        circle.getBounds().setLocation(new Point(newLocation.x, newLocation.y));           
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getDireccion() {
        return direccion;
    }

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shape getCircle() {
        return circle;
    }

    public void setCircle(Shape circle) {
        this.circle = circle;
    }

    public Point getNewLocation() {
        return newLocation;
    }

    public void setNewLocation(Point newLocation) {
        this.newLocation = newLocation;
    }

    /**
     *
     * @author kduran
     */
    public static class BolaBuilder implements IBuilder<Bola>{

        private Color color;
        private int velocidad;
        private int direccion;

        public BolaBuilder setColor(Color color){
            this.color = color;
            return this;
        }

        public BolaBuilder setVelocidad(int velocidad){
            this.velocidad = velocidad;
            return this;
        }

        public BolaBuilder setDireccion(int direccion){
            this.direccion = direccion;
            return this;
        }

        @Override
        public Bola build() {
            return new Bola(color, direccion, velocidad);
        }

    }
   @Override
    public Bola clone() {
        return new Bola(this.color, this.direccion, this.velocidad);
    }

    @Override
    public Bola deepClone() {
        return clone();
    }

    
}
