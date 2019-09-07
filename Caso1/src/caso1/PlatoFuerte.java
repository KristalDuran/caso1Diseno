/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso1;

/**
 *
 * @author kduran
 */
public class PlatoFuerte extends Producto{
    
    public PlatoFuerte(String nombre, int precio, int codigo) {
        super(nombre, precio, codigo);
    }
    
    @Override
    public String toString(){
        return super.getNombre() + " cod: " +
                super.getCodigo() + " $" + 
                super.getPrecio();
    }
}
