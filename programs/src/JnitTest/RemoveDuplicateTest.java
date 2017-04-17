package JnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.RemoveDuplicates;

public class RemoveDuplicateTest {

	@Test
	public void test() {
		RemoveDuplicates rd=new RemoveDuplicates();
		String result=rd.remove("liril");
		assertEquals("lir",result);
	}

}
