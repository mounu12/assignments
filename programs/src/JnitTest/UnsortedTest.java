package JnitTest;

import static org.junit.Assert.*;

import java.util.LinkedList;

import org.junit.Test;

import junit.Unsorted;

public class UnsortedTest {

	@Test
	public void test() {
		Unsorted us=new Unsorted();
		LinkedList<Integer> ll=new LinkedList<Integer>();
		LinkedList<Integer> result=us.unsorted(new int[]{1,3,4,5,6});
		ll.add(2);
		assertTrue(ll.equals(result));
	}

}
