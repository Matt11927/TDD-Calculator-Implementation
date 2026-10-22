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
    public void testsum(){
        //important to fail the test first
        int expected = -1;
        int actual = 2;
        assertEquals(expected,actual); // If pass in match, pass test else fails

    }


}
