package junit.practice;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.junit.MockitoJUnitRunner;

/**
 * Esta clase permite realizar test utilizando la libreria mockito. Mockito es
 * una librería Java que permite simular el comportamiento de una clase de forma
 * dinámica. De esta forma nos aislamos de las dependencias con otras clases y
 * sólo testeamos la funcionalidad concreta que queremos.
 *
 * @author RENTCOM SAS
 */
@RunWith(MockitoJUnitRunner.class)
public class GameTest {
    
    private static final int OPTION_SCISSORS = 2;
    private ByteArrayOutputStream out;

    @InjectMocks
    private Game game;

    @Mock
    Scanner scanner;

    @Mock
    Random random;
    
    @Before
    public void setUp(){
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        
    }

    @Test
    public void whenWriteQuitThenExitGame() {
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        game.play();
        
        assertTrue(out.toString().contains("Let's play Rock"));
    }

    @Test
    public void whenChooseRockThenBeatsScissors() {
        when(scanner.nextLine()).thenReturn("Rock").thenReturn("Quit");
        when(random.nextInt(3)).thenReturn(OPTION_SCISSORS);
        game.play();
        
        assertTrue(out.toString().contains("Computer chose scissors"));
        assertTrue(out.toString().contains("wins:1"));
    }
}
