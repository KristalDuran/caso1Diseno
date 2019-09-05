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
public interface IFactory {
    public Combo crearPedido(int numeroCombo, PlatoFuerte platoFuerte, ArrayList<Producto> extras);
}
