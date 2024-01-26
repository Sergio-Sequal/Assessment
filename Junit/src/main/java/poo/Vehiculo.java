
package poo;


public abstract class Vehiculo {
    String marca;
    String patente;
    String modelo;

    public Vehiculo(String marca, String patente, String modelo) {
        this.marca = marca;
        this.patente = patente;
        this.modelo = modelo;
    }
    
    
    /**
     * Este método permite encender un vehículo
     */
    public void encender(){
        System.out.println("Encendiendo...");
    }
    public void acelerar(){
        System.out.println("Acelerando...");
    }
    public void frenar(){
        System.out.println("Frenando...");
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", patente=" + patente + ", modelo=" + modelo;
    }
    
    
}
