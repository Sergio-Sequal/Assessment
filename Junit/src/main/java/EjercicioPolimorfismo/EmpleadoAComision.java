package EjercicioPolimorfismo;


public class EmpleadoAComision extends Empleado{
    private double salarioMinimo;
    private double montoPorCliente;
    private int cantidadClientesCaptados;

    public EmpleadoAComision(double salarioMinimo, double montoPorCliente, int cantidadClientesCaptados, 
            String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.salarioMinimo = salarioMinimo;
        this.montoPorCliente = montoPorCliente;
        this.cantidadClientesCaptados = cantidadClientesCaptados;
    }

    @Override
    public double getSalario() {
        double salario = montoPorCliente * cantidadClientesCaptados;
        if(salario < salarioMinimo){
            salario = salarioMinimo;
        }
        return salario;
    }
    
    
    
}
