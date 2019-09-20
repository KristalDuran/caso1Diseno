/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author raque
 */
public class ConsultaBDAdapter implements IAdapter{

    @Override
    public ServiceResponse sendRequest(ServiceRequest request) {
        ConsultaBD conBD= new ConsultaBD();
        
        ServiceResponse response = new ServiceResponse();
        Empleado empleado = conBD.obtenerDatosEmpleado(request.getNombre(),request.getFirma());
        if(empleado!=null){
            
            response.setEmpleado(empleado);
            return response;
        
        }
        return null;
        
    }
}
