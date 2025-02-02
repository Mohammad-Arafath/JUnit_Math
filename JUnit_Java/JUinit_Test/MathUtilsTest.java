package JUinit_Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
    private MathUtils calculate;

    // This method is executed before each test case
    @BeforeEach
    void setUp() {
        calculate = new MathUtils(); // Initialize the calculator instance
        System.out.println("Calculation completed successfully.");
    }

    // This method is executed after each test case
    @AfterEach
    void tearDown() {
        calculate = null; // Clean up resources
        System.out.println("Teardown completed.");
    }

    @Test
    void testAdd() {
        assertEquals(5, calculate.add(2, 3), "Addition failed");
    }

    @Test
    void testSubtract() {
        assertEquals(1, calculate.subtract(3, 2), "Subtraction failed");
    }

    @Test
    void testMultiply() {
        assertEquals(6, calculate.multiply(2, 3), "Multiplication failed");
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculate.divide(6, 3), "Division failed");
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1.0, calculate.divide(6, 0), "Division by zero should return -1.0");
    }
    
    @Test
    void testEdgeByZero() {
    	assertEquals(-1.0, calculate.divide(0, 0),"Devide 0 by 0 should return -1.0");
    }
}
