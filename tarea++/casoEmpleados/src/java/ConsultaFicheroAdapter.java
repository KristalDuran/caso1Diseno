/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author raque
 */
public class ConsultaFicheroAdapter implements IAdapter{

    @Override
    public ServiceResponse sendRequest(ServiceRequest request) {
        ConsultaFichero conF= new ConsultaFichero();
        
        ServiceResponse response = new ServiceResponse();
        Empleado empleado = conF.consultar(request.getNombre(),request.getFirma());
        if(empleado!=null){
            
            response.setEmpleado(empleado);
            return response;
        
        }
        return null;
        
    }
}
