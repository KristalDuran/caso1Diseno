/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

import java.util.ArrayList;

/**
 *
 * @author kduran
 */
public class Combo {
    private int codigo;
    private PlatoFuerte platoFuerte;
    private ArrayList<Adicional> adicionales;
    private ArrayList<Bebida> bebidas;

    private Combo(int codigo, PlatoFuerte platoFuerte, ArrayList<Adicional> adicionales, 
            ArrayList<Bebida> bebidas) {
        this.codigo = codigo;
        this.platoFuerte = platoFuerte;
        this.adicionales = adicionales;
        this.bebidas = bebidas;
    }

    public Combo(PlatoFuerte platoFuerte) {
        this.platoFuerte = platoFuerte;
    }
    
    public Combo() {
    }
    
    public PlatoFuerte getPlatoFuerte() {
        return platoFuerte;
    }

    public void setPlatoFuerte(PlatoFuerte platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public ArrayList<Adicional> getAdicionales() {
        return adicionales;
    }

    public void setAdicionales(ArrayList<Adicional> adicionales) {
        this.adicionales = adicionales;
    }

    public ArrayList<Bebida> getBebidas() {
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas) {
        this.bebidas = bebidas;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
}