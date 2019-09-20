/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class ConsultaFichero {
    String firmaFichero = "159";
    
    public Empleado consultar(String nombre,String firma){
        if(firma == firmaFichero){
            for(Empleado emp: main.empleados){
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
