/*IN TDD
* 1-write failing unit test first
* 2-write just enough for production code to pass unit test
* */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    Calculator calculator = new Calculator();

    //Junit will need to be public void method is how to create a unit test

    @Test
    public void testSum(){
        //fixed test
        int expected = 3;
        int actual = calculator.sum(1,2); // == 3
        assertEquals(expected,actual); // If pass in match, pass test else fails

    }

    @Test
    public void testSubtract(){
        int expected = -1;
        int actual = calculator.subtract(1,2); // == -1
        assertEquals(expected,actual);
    }

    @Test
    public void testMultiply(){
        int expected = 2;
        int actual = calculator.multiply(1,2); // == 2
        assertEquals(expected,actual);
    }


}
