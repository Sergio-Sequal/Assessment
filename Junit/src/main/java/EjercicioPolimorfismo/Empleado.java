
package EjercicioPolimorfismo;

import java.time.LocalDate;

abstract class Empleado {
    
    private String DNI;
    private String nombre;
    private String apellido;
    private int anioIngreso;

    public Empleado(String DNI, String nombre, String apellido, int anioIngreso) {
        this.DNI = DNI;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }

    public String getNombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public int antiguedadEnAnios(){
        int anioActual = LocalDate.now().getYear();
        return anioActual - anioIngreso;
    }
       
    public abstract double getSalario();
    
    
    
}
