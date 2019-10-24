/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socketconexion;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import socketconexion.cliente.Cliente;
import socketconexion.servidor.Servidor;

/**
 *
 * @author kduran
 */
public class SocketConexion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            Servidor serv = new Servidor(); //Se crea el servidor
            
            System.out.println("Iniciando servidor\n");
            serv.startServer(); //Se inicia el servidor
            
            Cliente cli = new Cliente(); //Se crea el cliente

            System.out.println("Iniciando cliente\n");
            cli.startClient(); //Se inicia el cliente
            
        } catch (IOException ex) {
            Logger.getLogger(SocketConexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
