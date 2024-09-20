import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class ArrayOperationsTest {

    private int[] array1;
    private int[] array2;

    @BeforeAll
    static void setupBeforeAll() {
        System.out.println("Before All Tests");
    }

    @AfterAll
    static void tearDownAfterAll() {
        System.out.println("After All Tests");
    }

    @BeforeEach
    void setupBeforeEach() {
        System.out.println("Setting up before each test");
        array1 = new int[]{1, 2, 3, 4, 5};
        array2 = new int[]{5, 4, 3, 2, 1};
    }

    @AfterEach
    void tearDownAfterEach() {
        System.out.println("Tearing down after each test");
    }

    @Test
    public void testArraysEqual() {
        Arrays.sort(array2);  // Sorting array2 to make it equal to array1
        assertArrayEquals(array1, array2, "The arrays should be equal after sorting");
    }

    @Test
    public void testArraysNotEqual() {
        assertFalse(Arrays.equals(array1, array2), "The arrays should not be equal");
    }
}
