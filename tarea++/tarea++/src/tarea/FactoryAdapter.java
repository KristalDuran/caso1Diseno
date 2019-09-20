/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

/**
 *
 * @author raque
 */
public class FactoryAdapter {

    public FactoryAdapter() {
        
    }

    
    public static IAdapter callBank(int banco){
        switch(banco){
            case 1: banco = 1;
                return new BankXAdapter();
            case 2: banco = 2;
                return new BankYAdapter();
            case 3: banco =3;
                return new BankZAdapter();
            default:  System.out.println("numero de banco inválido");;
        }
        return null;
    }
}
