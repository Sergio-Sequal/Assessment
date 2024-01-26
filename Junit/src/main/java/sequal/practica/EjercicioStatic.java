
package sequal.practica;


public class EjercicioStatic {
    
    public static void main(String[] args) {
        
        Ticket t1 = new Ticket("2023/05/20", "324323232");
        Ticket t2 = new Ticket("2023/01/10", "454665533");
        Ticket t3 = new Ticket("2023/04/02", "123454545");
        Ticket t4 = new Ticket("2023/11/25", "978323212");
        
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
        System.out.println(t4.toString());
        
    }
    
}

class Ticket{
    private static int contador = 0;
    private int numero;
    private String fechaCompra;
    private String DNIPersona;

    public Ticket(String fechaCompra, String DNIPersona) {
        // En este punto es donde la variable de tipo static hace la magia, 
        // permitiendo realizar el cambio para todos los objetos que se creen en la clase
        // el cual es el comportamiento que tiene una variable o método static, 
        // modificar un campo para todos los objetos que nacen de la clase
        contador ++;
        this.numero = contador;
        this.fechaCompra = fechaCompra;
        this.DNIPersona = DNIPersona;
    }

    @Override
    public String toString() {
        return "Ticket{" + "numero=" + numero 
                + ", fechaCompra=" + fechaCompra 
                + ", DNIPersona=" + DNIPersona + '}';
    }
    
    
    
}
