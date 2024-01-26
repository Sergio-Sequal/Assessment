package memoria.estatica;


import java.util.Arrays;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Implementación de la calse Esfera con memoria estática
        TDAEsfera esferita = new TDAEsfera(4);
        System.out.println("*******************************");
        System.out.println("Radio: " + esferita.getRadio());
        System.out.println("Diámetro: " + esferita.getDiametro());
        System.out.println("Circunferencia: " + esferita.getCircunferencia());
        System.out.println("Área: " + esferita.getArea());
        System.out.println("Volumne: " + esferita.getVolumen());

        /**
         * Implementando un un tipo de dato abstracto de memoria estática Esta
         * clase tiene el nombre de Array y ya nos lo proporciona Java          *
         */
        int numeros[] = new int[5];
        String words[] = new String[5];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número: " + (i + 1)));

        }

        System.out.println("Los elementos del vector sin ordenar son: ");
        for (int numero : numeros) {
            System.out.print("[" + numero + "]");
        }
        System.out.println("");

        //En este punto hacemos uso del tipo de dato abstracto Array ya hecho por java
        System.out.println("\nLos elementos del vector ordenados son: ");
        //Esta linea de código nos permite ordenar el array
        Arrays.sort(numeros);
        for (int numero : numeros) {
            System.out.print("[" + numero + "]");
        }
        System.out.println("");
        
        
//        En este apartado llenaremos el arreglo words
        Arrays.fill(words, "Hello there");
        System.out.println("Elementos del arreglo words");
        for (String word : words) {
            System.out.println(word);
        }

        

    }

}
