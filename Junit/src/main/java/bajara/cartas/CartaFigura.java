package bajara.cartas;

import baraja.Palo;

public class CartaFigura extends CartaConPalo {

    private char letra;

    public CartaFigura(char letra, Palo palo) {
        super(palo);
        this.letra = letra;
    }

    @Override
    public String getRepresentacion() {
        return letra + super.getRepresentacion();
    }

}
