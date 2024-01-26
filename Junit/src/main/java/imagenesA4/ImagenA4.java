package imagenesA4;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JFileChooser;
import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;

public class ImagenA4 {

    private static final int ALTO = 796;
    private static final int ANCHO = 1123;

    public static boolean configurationImage() {
        // Crear un selector de archivos
        try {
            JFileChooser selectorDeArchivos = new JFileChooser();
            selectorDeArchivos.setDialogTitle("Seleccionar Imagen");

            // Mostrar el selector de archivos y obtener el resultado
            int resultado = selectorDeArchivos.showOpenDialog(null);

            if (resultado == JFileChooser.APPROVE_OPTION) {
                // Obtener el archivo seleccionado
                File archivoSeleccionado = selectorDeArchivos.getSelectedFile();

                // Crear un ImageIcon a partir de la imagen seleccionada
                ImageIcon icono = new ImageIcon(archivoSeleccionado.getPath());

                // Obtener la imagen del ImageIcon
                Image imagen = icono.getImage();

                redimensionarImagen(imagen);
            }
            return true;

        } catch (Exception e) {
            e.getMessage();
        }
        return false;
    }

    public static boolean redimensionarImagen(Image imagen) {

        Image imagenModificada;
        ImageIcon iconoModificado;
        int nuevoAncho = 0;
        int nuevoAlto = 0;
        // Obtener el ancho y el alto de la imagen
        int ancho = imagen.getWidth(null);
        int alto = imagen.getHeight(null);

        try {

            if (alto == ALTO && ancho == ANCHO) {
                nuevoAncho = ancho;
                nuevoAlto = alto;
                JOptionPane.showMessageDialog(null, "Su orientación es Horizontal");
            } else if (alto >= ALTO && ancho >= ANCHO) {
                nuevoAncho = ANCHO;
                nuevoAlto = ALTO;
                JOptionPane.showMessageDialog(null, "Su orientación es Horizontal");
            } else if (alto < ALTO && ancho > ANCHO) {
                nuevoAlto = ALTO;
                nuevoAncho = ANCHO;
                JOptionPane.showMessageDialog(null, "Su orientación es Horizontal");
            } else if (alto > ALTO && ancho < ANCHO) {
                nuevoAncho = ancho;
                nuevoAlto = alto;
                JOptionPane.showMessageDialog(null, "Su orientación es vertical");
            }

            imagenModificada = imagen.getScaledInstance(nuevoAncho, nuevoAlto, Image.SCALE_SMOOTH);
            iconoModificado = new ImageIcon(imagenModificada);
            mostrarVentanaConImagen(iconoModificado);

            JOptionPane.showMessageDialog(null, "Tamaño original: " + alto + " X " + ancho + " Tamaño actual: "
                    + nuevoAlto + " X " + nuevoAncho);

            return true;

        } catch (Exception e) {
            e.getMessage();
        }
        return false;

    }

    // Método opcional mostrar la imagen en una ventana
    private static void mostrarVentanaConImagen(ImageIcon icono) {
        JFrame ventana = new JFrame("Ventana con Imagen");
        ventana.setSize(icono.getIconWidth(), icono.getIconHeight());

        JLabel etiquetaImagen = new JLabel(icono);
        ventana.add(etiquetaImagen);

        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

    //Punto de arranque
    public static void main(String[] args) {

        configurationImage();

    }
}
