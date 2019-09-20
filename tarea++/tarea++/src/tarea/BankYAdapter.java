/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author raque
 */
public class BankYAdapter implements IAdapter{

  
    @Override
    public BankResponse sendRequest(BankRequest request) {
        BankY bankY = new BankY();
        
        
        BankResponse response = new BankResponse();
        
        do{
             try {
                 System.out.println("BankY se encuentra procesando su petición!!");
                 Thread.sleep(10000);
                 
            } catch (InterruptedException ex) {
                System.out.println("Error ==> " + ex.getMessage());
                ex.printStackTrace();
            }
        }
        while(response == null);
        
            String resp = bankY.validateCustomer(request.getCustomer(), request.getAmount());
            if(resp == "y"){
                response.setApproval(true);
            }else{
                response.setApproval(false);
            }
             return response;
        }
           

}
