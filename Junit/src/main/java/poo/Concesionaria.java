package poo;

import java.util.ArrayList;

/**
 * Esta clase permite gestionar la concesionaria 
 * @author RENTCOM SAS
 */
public class Concesionaria {
    
//  Esta es la forma de aplicar el UPCASTING(Generalización) en java, esta técnica nos permite simplificar el código y poder
//  generalizar métodos, estructuras de datos, ect. Ojo esto solo funciona cuando tenemos herencia.
//  Usar la generalización puede ocacionar el perder el funcionamiento que tengan las clases hijas de esa clase padre
//  Generalizar implica tratar al objeto como si fuera de un tipo mas alto en la jerarquia de herencia

    
    private ArrayList<Vehiculo> vehiculo;
    
    public Concesionaria(){
        this.vehiculo = new ArrayList<>();
    }
    
    /**
     * Este método permite agregar vehículos sin importar el tipo
     * @param v 
     */
    public void agregarVehiculo(Vehiculo v){
//      De este modo podemos preguntar que tipo de clase es la que se esta instanceando, hay que utilizarlo con cuidado
        if(v instanceof Auto){
//           Auto  a = (Auto) v;
//           a.prenderAire();
            ((Auto) v).prenderAire();
        }
        this.vehiculo.add(v);
    }
    
    /**
     * Este método permite listar todos los vehiculos registrados en la concesionaria
     */
    public void listarVehiculos(){
        for(Vehiculo v: vehiculo){
            System.out.println(v.toString());
        }
    }
    
    
}
