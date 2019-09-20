/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.ArrayList;

/**
 *
 * @author raque
 */
public class Tarea {
    //simulacion de BD de los bancos. 
    static ArrayList<Customer> customersBankX = new ArrayList();
    static ArrayList<Customer> customersBankY = new ArrayList();
    static ArrayList<Customer> customersBankZ = new ArrayList();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        customersBankX.add(new Customer("Ana Vargas", 1800.05));
        customersBankX.add(new Customer("Paco Alvarado", 1200.05));
        customersBankX.add(new Customer("Juan Pérez", 1300.05));
        customersBankX.add(new Customer("Jose Mora", 11400.05));
        customersBankY.add(new Customer("Luis Arce", 1500.05));
        customersBankY.add(new Customer("Pedro Rojas", 18600.05));
        customersBankY.add(new Customer("Adrian Jimenez", 18800.05));
        customersBankY.add(new Customer("Jairo Blanco", 17500.05));
        customersBankZ.add(new Customer("Maria Cervantes", 15000.05));
        customersBankZ.add(new Customer("Raquel Miranda", 19900.05));
        customersBankZ.add(new Customer("Eduardo Ramirez", 1145600.100));
        customersBankZ.add(new Customer("Emma Soto", 19005.05));
        customersBankX.add(new Customer("Fernanda Rojas", 17895.05));
        customersBankY.add(new Customer("Marias Vargas", 7.75));
        
        //banco 1 = bankX
        //banco 2 = bankY
        //banco 3 = bankZ
        
        FactoryAdapter factory = new FactoryAdapter();
        BankXAdapter bankX =  (BankXAdapter) factory.callBank(1);
        
        BankYAdapter bankY = (BankYAdapter) factory.callBank(2);
        
        BankZAdapter bankZ =  (BankZAdapter) factory.callBank(3);
        
        BankRequest request = new BankRequest();
        
        //prueba para el banco X
        System.out.println("****solicitud de crédito al bank X****");
        request.setCustomer("Fernanda Rojas");
        request.setAmount(1500.0);
        
        bankX.sendRequest(request);
        
        //prueba para el banco Y
        System.out.println("****solicitud de crédito al bank Y****");
        request.setCustomer("Adrian Jimenez");
        request.setAmount(1000.2);
        
        bankY.sendRequest(request);
        
        
        //prueba para el banco Z
        System.out.println("****solicitud de crédito al bank Z****");
        request.setCustomer("Eduardo Ramirez");
        request.setAmount(11000.300);
        
        bankZ.sendRequest(request);
        
        
        
        
        
        
        
        
    }
    
}
