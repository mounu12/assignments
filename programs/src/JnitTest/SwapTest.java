package JnitTest;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import junit.SwapNum;

public class SwapTest {

	@Test
	public void test() {
		SwapNum sn=new SwapNum();
		
		ArrayList<Integer> result=sn.Swap(6, 7);
	
		assertEquals(76,result);
		
	}

}
