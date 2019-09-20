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
public class BankXAdapter implements IAdapter{


    @Override
    public BankResponse sendRequest(BankRequest request) {
        
        BankX bankX = new BankX();
        
        
        BankResponse response = new BankResponse();
        
        response.setApproval(bankX.getApproval(request.getCustomer(), request.getAmount()));
        return response;
    }
    
}
