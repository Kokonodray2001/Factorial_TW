import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class FactorialTest {

    Factorial factorial;

    @BeforeEach
    void inti(){
        factorial =  new Factorial();
    }

    @Test
    @DisplayName("Checking factorial of 0")
    void factorialOfZeroChecker(){
        int expected = 1;
        int actual =  factorial.findFactorial(0);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Checking factorial for Negative Numbers")
    void factorialOfNegativeIntegersChecker(){
        assertThrows(IllegalArgumentException.class, ()->factorial.findFactorial(-1));
    }

    @Test
    @DisplayName("Checking factorial for Positive Numbers")
    void factorialOfPostiveIntegerChecker(){

        int expected = 120;
        int actual =  factorial.findFactorial(5);
        assertEquals(expected,actual);
    }

}

