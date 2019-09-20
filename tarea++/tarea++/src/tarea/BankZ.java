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
public class BankZ {
    
     public boolean getApproval(String customer, double amount) throws AdapterException{
         for(Customer cus: Tarea.customersBankZ){
            if(cus.nombreApellidos.equals(customer)&& cus.saldo>=amount){
                System.out.println("El cliente "+ customer+" le fue aprobado el crédito");
                return true;
            }
        }
        System.out.println("El cliente que busca no esta afiliado al banco");
        return false;
    }
    
}
