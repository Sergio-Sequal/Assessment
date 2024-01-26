package poo;

public class Moto extends Vehiculo {

    int anchoManubrio;

    public Moto(int anchoManubrio, String marca, String patente, String modelo) {
        super(marca, patente, modelo);
        this.anchoManubrio = anchoManubrio;
    }

    void hacerWheliee() {
        System.out.println("Haciendo la wheliee");
    }

    @Override
    public String toString() {
        return super.toString() + "anchoManubrio=" + anchoManubrio + '}';
    }
    
    

}
