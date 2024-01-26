/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package junit.practice;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENTCOM SAS
 */
public class FizzBuzz {
    
    public static final String BUZZ = "Buzz";
    public static final String FIZZ = "Fizz";

    public List<String> getNumbers() {
        List<String> numbers = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            numbers.add(getNumber(i));
        }
        return numbers;
    }

    private String getNumber(int i) {
        if (isMultiple(i, 3) && isMultiple(i, 5)) {
            return FIZZ + BUZZ;
        } else if (isMultiple(i, 3)) {
            return FIZZ;
        } else if (isMultiple(i, 5)) {
            return BUZZ;
        }
        return "" + i;

    }

    public static boolean isMultiple(int number, int multiple) {
        return number % multiple == 0;
    }    

}
