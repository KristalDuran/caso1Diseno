/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author raque
 */
public class Empleado {
    private String nombreApellios;
    private int salario;
    private String puesto;

    public Empleado(String nombreApellios, int salario, String puesto) {
        this.nombreApellios = nombreApellios;
        this.salario = salario;
        this.puesto = puesto;
    }

    Empleado() {
    }

    public String getNombreApellios() {
        return nombreApellios;
    }

    public void setNombreApellios(String nombreApellios) {
        this.nombreApellios = nombreApellios;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombreApellios=" + nombreApellios + ", salario=" + salario + ", puesto=" + puesto + '}';
    }
    
    
    
    
}
