
package junit;

import java.util.LinkedHashSet;
import java.util.Set;

public class DupMembers {

	static String result;
	public Set<Integer> removeDuplicates(int[] duplicateArray)
	{
		Set <Integer>  set=new LinkedHashSet<Integer>();
		for(Integer a:duplicateArray){
			set.add(a);
		}
		System.out.println("Without Duplications");
		for(Integer a:set){
			System.out.println(a);
		}
		return set;
	}

}

 
