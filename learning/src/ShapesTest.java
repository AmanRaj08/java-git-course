package learning.src;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import java.util.Arrays;

import org.junit.Test;
import org.junit.jupiter.api.*;
// import org.junit.jupiter.api.AfterAll;
// import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.BeforeAll;
// import org.junit.jupiter.api.BeforeEach;

public class ShapesTest {
    Shapes shape = new Shapes();

    @BeforeEach
    void init() {
        // shape = new Shapes();
        System.out.println("Shapes object initialized before each test.");
    }
    @BeforeAll
    static void initAll() {
        System.out.println("Shapes class initialized before all tests.");
    }
    @AfterAll
    static void cleanUp() {
        System.out.println("Shapes class cleaned up after all tests.");
    }

    @Test
    public void testComputeSquareArea() {      
        int result = shape.computeSquareArea(24);
        assertEquals(576, result);
        System.out.println("Square area computed successfully.");
        
    }
    @Test
    public void testComputeCircleArea() {
        double result = shape.computeCircleArea(5);
        assertEquals(78.5, result,0.01);
        System.out.println("Circle area computed successfully.");
        
    }
    @AfterEach
    void tearDown() {
        // shape = null;
        System.out.println("Shapes object cleaned up after each test.");
    }

    @Test(timeout = 1000) // This test will fail if it takes more than 1000 milliseconds, it is done in Junit4.
    public void testArrays(){
        int[] arr = {5, 2, 3, 4, 1};
        int[] expected = {1, 2, 3, 4, 5};
        Arrays.sort(arr);
        assertArrayEquals(expected, arr);
    }
      @Test
    public void testSortedArrays(){

        // try{
        //int[] unsortedArr = {5, 2, 3, 4, 1};
        // int[] sortedArr = shape.sortArray(unsortedArr);
        // for(int n : sortedArr){
        //     System.out.println(n);
        // }
        //fail();
        // }
        // catch(NullPointerException e){
        //     System.out.println("An error occurred: ");
        // }
        // assertThrows(NullPointerException.class, () -> shape.sortArray(unsortedArr));
        assertThrows(NullPointerException.class, () -> shape.sortArray(null));

    }

    @Test
    public void testSortingArray() {
        int[] arr = {5, 2, 3, 4, 1};
        int[] sortedArr = shape.sortingArray(arr);
        assertTimeout(Duration.ofMillis(100), () -> shape.sortingArray(sortedArr));
    }
    
}
