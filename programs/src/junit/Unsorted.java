package junit;

import java.util.LinkedList;

public class Unsorted {
public LinkedList<Integer> unsorted(int arr[]){
	LinkedList<Integer> ll=new LinkedList<Integer>();
	
	for(int i=0;i<arr.length;i++)
		for(int j=1;j<arr.length-i;j++)
			if(arr[j-1]>arr[j])
			{
				arr[j-1]=arr[j-1]+arr[j];
				arr[j-1]=arr[j-1]-arr[j];
				arr[j-1]=arr[j-1]-arr[j];
			}
	for(int j=0;j<arr.length-1;j++){
		   
		
		int value=arr[j];
		while(++value<arr[j+1]){
			
			ll.add(value);
			
		}
	}
	System.out.println(ll);
	return ll;
	}
	
}