package junit;

public class RemoveDuplicates {
	public String remove(String s)
	{
		String s2="";
		int i=0;
		while(i<s.length())
		{
			if(s.charAt(i)!=' ')
			{
				s2=s2+s.charAt(i);
				s=s.replace(s.charAt(i),' ');
			}
			i++;
		}
		return s2;
	}

}