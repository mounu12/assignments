package junit;

public class Polindrome {

		
		public  boolean isPolyndrome(String name){
			   if(name==null){
				   return false;
			   }
			    int len = name.length();
			    if (len <= 1) {
			        return true;
			    }
			    return (name.charAt(0) == name.charAt(len - 1)) &&
			           isPolyndrome(name.substring(1, len - 1));
			
		
}
}
			
