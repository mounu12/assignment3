package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment3.ArrayQueue;

public class ArrayQueueTest {
	 @Before
     public void setUp() 
     		throws Exception {

     }
	 @Test
	 public void testqueue(){
		 ArrayQueue queue=new ArrayQueue(5);
		 queue.enqueue(4);
		 queue.enqueue(5);
		 queue.enqueue(3);
		 queue.enqueue(2);
		 assertTrue(2==queue.dequeue());
		 assertTrue(3==queue.dequeue());
		 assertTrue(5==queue.dequeue());
		 assertTrue(4==queue.dequeue());
		 
	 }
}
