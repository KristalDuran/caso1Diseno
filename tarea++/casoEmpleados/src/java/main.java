
import java.io.IOException;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class main {
    
    public static ArrayList<Empleado> empleados = new ArrayList(); 
    public static ArrayList<Empleado> BDEmpleados = new ArrayList(); 
    
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        AdmArchivos adm = new AdmArchivos();
        System.out.println("tam lista"+empleados.size());
        
        BDEmpleados.add(new Empleado("Joaquin", 2500, "gerente general"));
        BDEmpleados.add(new Empleado("Adrian", 2500, "Leader Team"));
        BDEmpleados.add(new Empleado("Pedro", 2500, "Soporte"));
       
        //aqui hago las pruebas para ConsultaFicheroAdapter
        ConsultaFicheroAdapter cfa = new ConsultaFicheroAdapter();
        ServiceRequest request = new ServiceRequest();
        System.out.println(" pruebas fichero adapter");
        request.setFirma("159");
        request.setNombre("Juan");
        cfa.sendRequest(request);
        
        //aqui hago las pruebas para ConsultaBDAdapter
        System.out.println(" pruebas DB adapter");
        ConsultaBDAdapter cdb = new ConsultaBDAdapter();
        
        
        request.setFirma("12345");
        request.setNombre("Adrian");
        cdb.sendRequest(request);
        
    }
    
}
