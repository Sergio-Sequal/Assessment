package EjercicioPolimorfismo;

import java.util.ArrayList;

public class Empresa {
    private ArrayList<Empleado> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }
    
    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }
    
    public void mostrarSalario(){
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombreCompleto() + ": $" + emp.getSalario());
        }
    }
    
    public Empleado empleadoConMasClientes(){
        return null;
    }
    
    
}
