package JnitTest;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.Polindrome;

public class poliTest {

	@Test
	public void test() {
		Polindrome p=new Polindrome();
		boolean result=p.isPolyndrome("liril");
		assertEquals("true", result);
	}

}
