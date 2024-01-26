package baraja;

public enum Palo {
    DIAMANTE(Color.ROJO),
    CORAZON(Color.ROJO),
    PICA(Color.NERGRO),
    TREBOL(Color.NERGRO);
    
    private Color color;
    
    private Palo(Color color){
        this.color = color;
    }
    
    
    
}
