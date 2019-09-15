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
public class ComboBuilder implements IBuilder<Combo>{
        
        private int codigo;
        private PlatoFuerte platoFuerte;
        private ArrayList<Adicional> adicionales = new ArrayList<>();
        private ArrayList<Bebida> bebidas = new ArrayList<>();

        public ComboBuilder() {
        }

        public int getCodigo() {
            return codigo;
        }

        public ComboBuilder setCodigo(int codigo) {
            this.codigo = codigo;
            return this;
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
            return new Combo(codigo, platoFuerte, adicionales, bebidas);
        }
    }
