package EjercicioPolimorfismo;

public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa();
        
        emp.agregarEmpleado(new EmpleadoSalarioFijo(45000,"123","Luis","Perez", 2021));
        emp.agregarEmpleado(new EmpleadoAComision(4500, 10000, 7, "123","Ana","Lopez", 2014));
        
        emp.mostrarSalario();
    }
    
}
