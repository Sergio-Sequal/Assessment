package recursividad;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Recursividad {

    public static void main(String[] args) {
        //En esta línea de código vamos a crear un objeto de tipo Recursividad
        Recursividad obj = new Recursividad();
        //obj.bajarEscalera(20);
        
        //Factorial recursivo
        //System.out.println("El factorial es: " + obj.factorialRecursivo(4));
        System.out.println(obj.fibonacciRecursivo(6));
        
    }

    /**
     * Método para bajar escaleras de manera recursiva
     *
     * @param escalones
     */
    public void bajarEscalera(int escalones) {
        if (escalones == 0) {
            //Caso base, respuesta explicita o final
            System.out.println("Llegaste");
        } else if (escalones < 0) {
            System.out.println("Idiota no puedes bajar escaleras negativas");
        } else {
            try {
                //Dominio, división del problema original (problema - 1)
                Thread.sleep(1000);
                System.out.println("Bajando escalón número: " + escalones);
                //Aplicando la recursividad
                bajarEscalera(escalones - 1);
            } catch (InterruptedException ex) {
                System.out.println(ex);
            }
        }

    }
    
    /**
     * Método para realizar el ejercicio del factorial de un número mediante recursividad
     * @param number
     * @return 
     */
    
    public int factorialRecursivo(int number){
        //caso base
        if(number < 0){
            return 0;
        }
        if(number == 0){
            return 1;
        }else{
            return number * factorialRecursivo(number-1);
        }
        
    }
    
    /**
     * Sumando con recursividad
     * Nota: En la recursividad es necesario tener en cuenta que el flujo de ejecución es totalmente diferente al de un bucle, en este caso las llamadas a la función siempre
     * se veran interrumpidas hasta no llegar al caso base, cuando se llega al caso base es donde las llamadas a las funciones empiezan a realizar su trabajo.Cabe mencionar que cada llamada es una copia de una nueva función, esto quiere decir que se copiaran incluso las variables internas que tenga esa función lo que 
       repercute en más consumo de memoria
     * @param number
     * @return 
     */
    
    public int suma(int number){
        int valor;
        //caso base
        if(number == 1){
            valor = number;
        }else{
            System.out.println(number);
            valor = suma(number-1) + number;//Esta línea siempre va a ser interrumpida esperando el retorno de la función para luego poder sumarlo 
        }
        return valor;
    }
    
    
    /**
     * Serie fibonacci mediante recursividad
     */
    
    public int fibonacciRecursivo(int number){
        if(number  == 1 || number == 2){
            //Caso base (Respuesta explicita)
            return 1;
        }else{
            //Dominio (Problema - 1)
            return fibonacciRecursivo(number-1) + fibonacciRecursivo(number - 2);
        }
    }
    
    /**
     * Fibonacci mediante un ciclo
     * @param number
     * @return 
     */
    
    public int fibonacciCiclo(int number){
        int fibonacci = 0;
        int primero = 1;
        int segundo = 0;
        
        while(number > 0){
            fibonacci = primero + segundo;
            primero = segundo;
            segundo = fibonacci;
            number --;
            
        }
        return fibonacci;      
        
        
    }
    
    

}
