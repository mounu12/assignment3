package JunitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import assignment3.ListExample;

public class ListTest {

	@Test
	public void test() {
		ListExample ll=new ListExample(5);
		ll.insert(6);
		ll.insert(4);
		ll.insert(3);
		int i=ll.find(4);
		assertEquals(4,i);
		}

}
