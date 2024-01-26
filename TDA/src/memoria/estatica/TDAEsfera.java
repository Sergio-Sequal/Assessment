package memoria.estatica;

/**
 * Ejemplo de un tipo de dato abstracto de memoria estática llamado Esfera, asi es como funcionan
 * Estos TDA se implementan en la interfaz pública en este caso la clase Main


*/
public class TDAEsfera {

    private double radio;

    public TDAEsfera(double radioInicial) {
        if (radioInicial > 0) {
            this.radio = radioInicial;
        } else {
            this.radio = 0.0;

        }
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getDiametro() {
        return this.radio * 2;
    }

    public double getCircunferencia() {
        return (Math.PI * getDiametro());
    }
    
    public double getArea(){
        return (4 * Math.PI * radio * radio);
    }
    
    public double getVolumen(){
        return (4 * Math.PI * Math.pow(radio, 3)) / 3;
    }

}
