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
    private PlatoFuerte platoFuerte;
    private ArrayList<Adicional> adicionales;
    private ArrayList<Bebida> bebidas;

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
    @Override
    public String toString(){
        String string = "Combo: ";
        if (platoFuerte != null) {
            string += platoFuerte.toString() + " ";
        }
        for (Adicional adicional : adicionales) {
            string+= adicional.toString() + " ";
            
        }
        for (Bebida bebida : bebidas) {
            string+= bebida.toString() + " ";
        }
        
        return string + "\n";
    }

    @Override
    public Combo clone() {
        System.out.println("Clone");
        return new Combo(platoFuerte, adicionales, bebidas);
    }

    @Override
    public Combo deepClone() {
        ArrayList<Adicional> adicionalesClonados = new ArrayList<>();
        for (Adicional adicionale : adicionales) {
            adicionalesClonados.add(new Adicional(adicionale.getNombre(), adicionale.getPrecio(), adicionale.getCodigo()));
        }
        ArrayList<Bebida> bebidasClonados = new ArrayList<>();
        for (Bebida bebida : bebidas) {
            bebidasClonados.add(new Bebida(bebida.getNombre(), bebida.getPrecio(), bebida.getCodigo()));
        }
        return new Combo(new PlatoFuerte(platoFuerte.getNombre(), platoFuerte.getPrecio(), platoFuerte.getCodigo()),
                adicionalesClonados, bebidasClonados);    
    }
}