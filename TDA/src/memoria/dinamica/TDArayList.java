package memoria.dinamica;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TDArayList {

    public static void main(String[] args) {

        //Tipo de dato abstracto de memoria dinámica proporcionado por java
        ArrayList<String> cadenas = new ArrayList<>();
        String frase;
        String respuesta;

        do {
            frase = JOptionPane.showInputDialog(null, "Ingresa una frase");
            cadenas.add(frase);
            respuesta = JOptionPane.showInputDialog(null, "Deseas ingresar más frases (SI/NO) ?");
            respuesta = respuesta.toUpperCase();

        } while (respuesta.equals("SI"));

        //ArrayList contiene metodos add:agrega, get:obtener,set:actualizar, remove:eliminar, size:tamaño
        System.out.println("Contenido del ArrayList, y tiene un tamaño de: " + cadenas.size());
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }

    }

}
