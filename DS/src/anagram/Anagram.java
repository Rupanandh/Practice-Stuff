package anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Anagram {
	
	public static void main(String[] args)
	{
		System.out.println(findAnagrams("abab","ab").toString());
	}

	private static List<Integer> findAnagrams(String s,String p) {
		int index=0;
		int length=p.length();
		char[] ps =p.toCharArray();
		Arrays.sort(ps);
		ArrayList<Integer> indeces = new ArrayList<Integer>();
		if(s==null || p == null || p.length( )==0||s.length()==0|| p.length()>s.length())
		{
			return indeces;
		}
		else{
		while(index<=(s.length()-length)){
			String sub=s.substring(index,index+length);
			char[] subs=sub.toCharArray();				
			Arrays.sort(subs);						
			if(Arrays.equals(subs, ps))
			{				
				indeces.add(index);
			}
			index++;
		}
		return indeces	;
		}
			
			}

}
