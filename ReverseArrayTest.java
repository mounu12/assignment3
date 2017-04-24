package JunitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;

import assignment3.ReverseArray;

public class ReverseArrayTest {
    
    @Test
    public void test(){
    	ArrayList<Integer> al=new ArrayList<>();
    
        int[] numbers = {1, 2, 3, 4, 5, 6};
        ReverseArray.reverse(numbers);
        al.add(6);
        al.add(5);
       assertEquals(al,numbers);
        //assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, numbers);
    }
}
    
  /*  @Test
    public void test1(){
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        ReverseArray.reverse(numbers);
        assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, numbers);
    }
}
*/
    
  /*  @Test
    public void testReverseWithEmptyArray(){
        int[] numbers = {};
        HelloWorld.reverse(numbers);
        assertArrayEquals(new int[]{}, numbers);
    }
    */