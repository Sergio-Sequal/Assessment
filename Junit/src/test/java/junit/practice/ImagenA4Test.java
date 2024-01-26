package junit.practice;

import imagenesA4.ImagenA4;
import java.awt.Image;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author RENTCOM SAS
 */
public class ImagenA4Test {

    @Test(expected = NullPointerException.class)
    public void redimensionarImagenNullTest() {
        Image imagenMock = null;

        assertEquals(Boolean.TRUE, ImagenA4.redimensionarImagen(imagenMock));

    }

}
