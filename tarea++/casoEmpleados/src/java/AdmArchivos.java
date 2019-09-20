
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class AdmArchivos {
    
    public String s1;
    public String s2;
    
    
     BufferedReader br;

    public AdmArchivos() throws FileNotFoundException, IOException {
        this.br = new BufferedReader (new FileReader ("C:\\Users\\raque\\Documents\\GitHub\\caso1Diseno\\tarea++\\casoEmpleados\\src\\java\\empleados.txt"));
        //s1 = br.readLine();
        String nombre="";
        int salario=0;
        String puesto="";
        
    
        while ((s1 = br.readLine()) != null){
            System.out.println ("linea del archivo es: " + s1);
            
            int numTokens = 0;
            StringTokenizer st = new StringTokenizer (s1);
            
            while (st.hasMoreTokens()){
            s2 = st.nextToken();
            numTokens++;
            System.out.println ("    Palabra " + numTokens + " es: " + s2);
            String ncadena=s2.substring(0,s2.length()-1);
                if(numTokens==1){
                    
                    nombre = ncadena;
                    
                }else if(numTokens==2){
                    salario = Integer.parseInt(ncadena);
                }else{
                    puesto = ncadena;
                }
            }
            Empleado e = new Empleado(nombre, salario, puesto);
            main.empleados.add(e);
            
        }
         
       
        
        
        
        
       
    }
    
    
    
}
