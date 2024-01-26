package bajara.cartas;

public abstract class Carta {

    private boolean tapada;

    public Carta() {
        this.tapada = true;
    }

    public boolean isTapada() {
        return tapada;
    }

    public void darVuelta() {
        tapada = !tapada;

    }

    public void mostrar() {
        if (tapada) {
            System.out.println("*****************");
        } else {
            System.out.println(getRepresentacion());
        }

    }

    public String getRepresentacion() {
        return "Carta genérica";
    }

}
