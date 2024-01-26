
package sequal.practica;

public class Motor {
    private String numero;
    private double cilindrada;
    private String tipo;
    private int rpmActuales;

    public Motor(String numero, double cilindrada, String tipo) {
        this.numero = numero;
        this.cilindrada = cilindrada;
        this.tipo = tipo;
        this.rpmActuales = 0;
    }
    
//  Esta es una manera incorrecta de aplicar el concepto "TELL, DON'T ASK"

    public int getRpmActuales() {
        return rpmActuales;
    }

    public void setRpmActuales(int rpmActuales) {
        if (rpmActuales > 0) {
            this.rpmActuales = rpmActuales;

        }
    }
//  Fin de la mala práctica
    
//  Esta es la manera correcta de aplicar el TELL, DON'T ASK
//  Nota: siempre que un método o función implique trabajar con los atributos de 
//  la clase, la lógica deberia aplicarse en la clase que los contiene, para que 
//  permita solo implementar solo el paso de mensajes por objetos
    public void acelerar(){
        this.rpmActuales += 1000;
    }
    

    public void setCilindrada(double cilindrada) {
        if(cilindrada > 0){
            this.cilindrada = cilindrada;            
        }
    }

    @Override
    public String toString() {
        return "Motor{" + "numero=" + numero + ", cilindrada=" + cilindrada 
                + ", tipo=" + tipo + ", rpmActuales=" + rpmActuales + '}';
    }
    

 
    
    
    
    
    
    
}
