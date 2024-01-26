
package EjercicioPolimorfismo;

public class EmpleadoSalarioFijo extends Empleado{
    
    private static final double PORC1 = 0.05;
    private static final double PORC2 = 0.1;
    private static final int ANIO1 = 2;
    private static final int ANIO2 = 5;
    private double sueldoBasico;

    public EmpleadoSalarioFijo(double sueldoBasico, String DNI, String nombre, String apellido, int anioIngreso) {
        super(DNI, nombre, apellido, anioIngreso);
        this.sueldoBasico = sueldoBasico;
    }
    
    private double porcentajeAdicional(){
        int antiguedad = antiguedadEnAnios();
        double porcentaje = 0;
        if(antiguedad > ANIO2){
            porcentaje = PORC2;
        }else if(antiguedad >= ANIO1){
            porcentaje = PORC1;
        }
        return porcentaje;
    }

    @Override
    public double getSalario() {
        return sueldoBasico + sueldoBasico * porcentajeAdicional();
    }
    
}
