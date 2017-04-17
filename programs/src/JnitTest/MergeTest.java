package JnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.MergeArray;

public class MergeTest {

	@Test
	public void test() {
		MergeArray ma=new MergeArray();
		ArrayList<Integer> al=new ArrayList<Integer>();
		ArrayList<Integer> result=ma.merge(new int[]{2,4,5},new int[]{6,7,8});
		al.add(2);
		al.add(4);
		al.add(5);
		al.add(6);
		al.add(7);
		al.add(8);
		assertEquals(al, result);
	
	}

}
