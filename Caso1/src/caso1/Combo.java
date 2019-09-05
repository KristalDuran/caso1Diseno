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
    private PlatoFuerte platoFuerte;
    private ArrayList<Adicional> adicionales;
    private ArrayList<Bebida> bebidas;

    private Combo(PlatoFuerte platoFuerte, ArrayList<Adicional> adicionales, 
            ArrayList<Bebida> bebidas) {
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

    public static class ComboBuilder implements IBuilder<Combo>{

        private PlatoFuerte platoFuerte;
        private ArrayList<Adicional> adicionales = new ArrayList<>();
        private ArrayList<Bebida> bebidas = new ArrayList<>();

        public ComboBuilder() {
        }
        
        public ComboBuilder setPlaBuilder(PlatoFuerte platoFuerte){
            this.platoFuerte = platoFuerte;
            return this;
        }
        
        public ComboBuilder addAdiciona(int codigo, int precio, String nombre){
            adicionales.add(new Adicional(nombre, precio, codigo));
            return this;
        }
        
        public ComboBuilder addBebida(int codigo, int precio, String nombre){
            bebidas.add(new Bebida(nombre, precio, codigo));
            return this;
        }
        
        @Override
        public Combo build() {
            return new Combo(platoFuerte, adicionales, bebidas);
        }
    }
}