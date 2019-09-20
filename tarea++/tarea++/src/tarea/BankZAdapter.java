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
public class BankZAdapter implements IAdapter {

   

    @Override
    public BankResponse sendRequest(BankRequest request) {
        BankZ bankZ = new BankZ();
        
        
        BankResponse response = new BankResponse();
     
    try {
            if(bankZ.getApproval(request.getCustomer(), request.getAmount())){
                response.setApproval(true);
                
            }
            
        } catch (AdapterException e) {
            System.out.println("Error ==> " + e.getMessage());
            e.printStackTrace();
        }
 
       return response; 
        
    }
}
