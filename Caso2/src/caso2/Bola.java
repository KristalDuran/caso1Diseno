/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;

/**
 *
 * @author kduran
 */
public class Bola implements IPrototype<Bola>{
    private Color color;
    private int direccion;
    private int velocidad;

    public Bola(Color color, int direccion, int velocidad) {
        this.color = color;
        this.direccion = direccion;
        this.velocidad = velocidad;
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

   @Override
    public Bola clone() {
        return new Bola(this.color, this.direccion, this.velocidad);
    }

    @Override
    public Bola deepClone() {
        return clone();
    }

   
    
    
}
