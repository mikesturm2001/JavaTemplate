package ExampleProblems;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void given3TestFizzBuzzTest() {
        int x = 3;
        String result = fizzBuzz.calculateFizzBuzz(3);
        assertEquals("Fizz", result);
    }

    @Test
    public void given5TestFizzBuzz() {
        int x = 5;
        String result =  fizzBuzz.calculateFizzBuzz(5);
        assertEquals("Buzz", result);
    }

    @Test
    public void given15TestFizzBuzz() {
        int x = 15;
        String result =  fizzBuzz.calculateFizzBuzz(15);
        assertEquals("Fizz Buzz", result);
    }

    @Test
    public void given7TestFizzBuzz() {
        int x = 7;
        String result = fizzBuzz.calculateFizzBuzz(7);
        assertEquals("", result);
    }

    @Test
    public void floatingPointTest() {
        assert(3*0.1 == 0.3);
    }
}
