package junit;

public class primeFactor {
	public String prime(int n){
		String s="";
		int i=2;
		while(n>1){
			if(n%i==0){
				s=s+String.valueOf(i);
				n=n/1;
				
			}
			else
				i++;
			
		}
		
		return s;
		
	}

}
