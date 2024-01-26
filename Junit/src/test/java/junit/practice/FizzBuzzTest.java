package junit.practice;

import java.util.List;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class FizzBuzzTest {

    private static final String FIZZ = "Fizz";
    private static final String BUZZ = "Buzz";
    private FizzBuzz game;

    @Before
    public void before() {
        game = new FizzBuzz();
    }

    @Test
    public void getNumbersForMultiplesOfThreeOrFiveTest() {
        List<String> numbersList = game.getNumbers();
        assertEquals("1", numbersList.get(0));
        assertEquals("2", numbersList.get(1));
        assertEquals("7", numbersList.get(6));
        assertEquals("13", numbersList.get(12));

    }

    @Test
    public void getFizzForMultiplesOfThreeTest() {
        List<String> numbersList = game.getNumbers();
        assertEquals(FIZZ, numbersList.get(2));
        assertEquals(FIZZ, numbersList.get(5));
        assertEquals(FIZZ, numbersList.get(8));
        assertEquals(FIZZ, numbersList.get(11));

    }

    @Test
    public void getFizzForMultiplesOfFiveTest() {
        List<String> numbersList = game.getNumbers();
        assertEquals(BUZZ, numbersList.get(4));
        assertEquals(BUZZ, numbersList.get(9));
        assertEquals(BUZZ, numbersList.get(19));
        assertEquals(BUZZ, numbersList.get(24));

    }

    @Test
    public void getFizzBuzzForMultiplesOfThreeAndFiveTest() {
        List<String> numbersList = game.getNumbers();
        assertEquals(FIZZ + BUZZ, numbersList.get(14));
        assertEquals(FIZZ + BUZZ, numbersList.get(29));
        assertEquals(FIZZ + BUZZ, numbersList.get(59));
        assertEquals(FIZZ + BUZZ, numbersList.get(89));

    }

}
