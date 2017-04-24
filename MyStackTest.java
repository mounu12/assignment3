package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment3.MyStackArray;

public class MyStackTest {

        @Before
        public void setUp() 
        		throws Exception {

        }

        @Test
        public void testStackArray() {
                MyStackArray stack = new MyStackArray(6);
                stack.push(1);
                stack.push(2);
                stack.push(3);
                stack.push(3);
                stack.push(4);
                String s=stack.display();
                assertEquals("43321",s);
               /* assertTrue(4 == stack.pop());
                assertTrue(3 == stack.pop());
                assertTrue(3 == stack.pop());
                assertTrue(2 == stack.pop());
                assertTrue(1 == stack.pop());*/
                
        }
}

      /*  @Test
        public void testStackList() {
                MyStackList<Integer> stack = new MyStackList<Integer>();
                stack.push(1);
                stack.push(2);
                stack.push(3);
                stack.push(3);
                stack.push(4);
                assertTrue(4 == stack.pop());
                assertTrue(3 == stack.pop());
                assertTrue(3 == stack.pop());
                assertTrue(2 == stack.pop());
                assertTrue(1 == stack.pop());
        }

}*/