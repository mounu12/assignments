package JnitTest;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;
import java.util.Set;

import org.junit.Test;

import junit.DupMembers;

public class DupMemberTest {

	@Test
	public void test() {
		DupMembers dm=new DupMembers();
		Set<Integer>  set=new LinkedHashSet<Integer>();
		Set<Integer> result=dm.removeDuplicates(new int[] {7, 3, 21, 7, 34, 18, 3, 21});
		set.add(7);
		set.add(3);
		set.add(21);	
		set.add(34);
		set.add(18);
		assertTrue(set.equals(result));
		
	}

}
