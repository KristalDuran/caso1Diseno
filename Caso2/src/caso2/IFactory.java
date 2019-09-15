/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso2;

import java.awt.Color;

/**
 *
 * @author raque
 */
public interface IFactory {
    
    public Bola crearBola(Color color, int direccion, int velocidad);
    
}
