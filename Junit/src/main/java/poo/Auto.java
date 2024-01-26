package poo;

public class Auto extends Vehiculo {

    boolean tieneAire;

    public Auto(boolean tieneAire, String marca, String patente, String modelo) {
        super(marca, patente, modelo);
        this.tieneAire = tieneAire;
    }

    void prenderAire() {
        if (tieneAire) {
            System.out.println("Encendiendo aire...");

        }
    }

    @Override
    public String toString() {
        return super.toString() + "tieneAire=" + tieneAire + '}';
    }

    
    

}
