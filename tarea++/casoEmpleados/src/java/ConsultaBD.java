/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class ConsultaBD {
    String  firmaBD = "12345";
    
    public Empleado obtenerDatosEmpleado(String nombre, String firma){
        if(firma == firmaBD){
            for(Empleado emp: main.BDEmpleados){
                if(emp.getNombreApellios().equals(nombre)){
                    System.out.println(emp.toString());
                    return emp;
                }
            }
            System.out.println("el empleado no existe");
            return null;
        }
        System.out.println("valor de la firma erroneo");
        return null;
    }
    
}
