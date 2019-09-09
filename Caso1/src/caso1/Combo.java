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
public class Combo implements IPrototype<Combo>{
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

    Combo(PlatoFuerte platoFuerte, ArrayList<Adicional> adicionales, ArrayList<Bebida> bebidas) {
        this.platoFuerte = platoFuerte;
        this.adicionales = adicionales;
        this.bebidas = bebidas;
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

    @Override
    public Combo clone() {
        return new Combo(platoFuerte, adicionales, bebidas);
    }

    @Override
    public Combo deepClone() {
        PlatoFuerte plato = null;
        if (platoFuerte != null) {
            plato = new PlatoFuerte(platoFuerte.getNombre(), platoFuerte.getPrecio(), platoFuerte.getCodigo());
        }
        ArrayList<Adicional> newAdicionales = new ArrayList<>();
        for (Adicional adicionale : adicionales) {
            newAdicionales.add(new Adicional(adicionale.getNombre(), adicionale.getPrecio(), adicionale.getCodigo()));
        }
        ArrayList<Bebida> newBebidas = new ArrayList<>();
        for (Bebida newBebida : bebidas) {
            newBebidas.add(new Bebida(newBebida.getNombre(), newBebida.getPrecio(), newBebida.getCodigo()));
        }
        
       return new Combo(plato, newAdicionales, newBebidas);
    }
    
}