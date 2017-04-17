package junit;

import java.util.ArrayList;

public class SwapNum {
public ArrayList<Integer> Swap(int x,int y) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	x=x+y;
	y=x-y;
	x=x-y;
	al.add(x);
	al.add(y);
	
	return al;
	
}

}
