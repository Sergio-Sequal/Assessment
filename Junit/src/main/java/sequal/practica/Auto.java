package sequal.practica;

/**
 * Esta clase permite crear autos de cualquier tipo. Esta es una muy buena
 * practica para documentar el código
 * <p>
 * A {@code Auto} facilita la gestión para la creación de autos en nuestro
 * programa. {@code getAuto} método.
 *
 * @author RENTCOM SAS
 */
public class Auto {

    private String marca;
    private double precio;
    private static String placa;
    private int combustible;
    private String estado;
    //esta es considerada una variable de clase y le pertenece solo a la clase
    private static double descuento;
    //esta es la forma de crear un atributo para la clase de tipo objeto
    private Motor motor;

    public Auto() {
    }

    public Auto(String marca, double precio, String estado, Motor motor) {
//      Una buena práctica es inicializar los parámetros mediante los médotos setter, asi.
        setPrecio(precio);
        setMarca(marca);
        setEstado(estado);
        Auto.placa = generarPlaca();
        //Al llamar una variable de tipo static debemos hacerlo mediante la clase, asi.
        Auto.descuento = 10;
        this.motor = motor;

    }
    
//  Esta es una manera incorrecta de aplicar el concepto "TELL, DON'T ASK"
//  Como en este ejemplo si necesitamos poner un método para obtener el motor
//  de la clase motor, debemos realizar el análisis pues lo estamos haciendo mal
    public Motor getMotor(){
        return motor;
    }
    
//  Fin de la mala práctica
    
//  Esta es la manera correcta de aplicar el principio TELL DON'T ASK, cuando tengamos
//  un atributo de tipo objeto y creamos un método get para obtener la referencia
//  de ese objeto debemos preguntarnos porque lo estamos haciendo, y si realmente 
//  estamos cumpliento con este principio
    public void acelerar(){
        this.motor.acelerar();
    }
    
    
    public Auto(String marca, double precio) {
//      La palabra this tambien es utilizada en la sobrecarga de constructores, para realizar
//      llamadas a un constructor y evitar repetir código, y se utiliza de la sgte manera
//      Si se deja this(); vacion hace referencia al constructor vacio.
//      Esto se utiliza con el fin de no repetir código
        this(marca, precio, "Usado", null);
 

    }
    
    public double precioPromocional(){
        return this.precio - this.precio * Auto.descuento / 100;
    }
    
    public static void anularDescuento(){
        //Al igual que las valiriables de clase sucede tambien con los métodos, solo le pertenecen a la clase
        //y un cambio en un metodo o variable estatica afectará a todos los objetos creados de esta clase
        //Nota: en un método estatico no se puede acceder a variables de instancia o a métodos de instancia
        //por ejemplo al poner this.precio = 0;  me marcaria un error dado que esta es una variable de instancia
        //para resumir, yo puedo desde un método de instancia acceder y comprobar métodos y atribulos de clase 
        //es decir de tipo static, pero no puedeo haerlo al reves. No puedo acceder en un contexto estatico
        //a variables y métodos de instancia o de objeto
        Auto.descuento = 0;
    }
    
    
    private String generarPlaca(){
        return "STB37D";
    }

    public double getPrecio() {
        return precio;
    }

    private void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    private void setMarca(String marca) {
        this.marca = marca;
    }

    public int getCombustible() {
        return combustible;
    }

    public void setCombustible(int combustible) {
        this.combustible = combustible;
    }

    public String getEstado() {
        return estado;
    }

    private void setEstado(String estado) {
        this.estado = estado;
    }
    

    /**
     * <p>
     * Este método permite obtener toda la información relacionada con los datos
     * del objeto ya creado a través de la clase {@code Auto}
     */
    void mostrarDatos() {
        System.out.println(marca + " " + precio + " " + placa + " " + estado);
    }

    /**
     * Método que permite añadir combustible al auto
     *
     * @param galones
     */
    void agregarCombustible(int galones) {
        if (galones > 0) {
            combustible = combustible + galones;
        }
    }
    
    /**
     * <p>Este es un ejemplo para la sobrecarga de métodos, que a diferencia de la sobrecarga
     * de métodos constructores, este se puede reutilizar con tal solo llamar al método
     * que actua de forma similar y asi evitar escribir código redundante.
     * @param nombreConductor 
     */
    public void encender(String nombreConductor){
        System.out.println("Hola " + nombreConductor + ", ya estoy encendido");
    }
    public void encender(){
        encender("Desconocido");
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", precio=" + precio + ", combustible=" 
                + combustible + ", estado=" + estado + ", motor=" + motor + '}';
    }




    
    
    

}
