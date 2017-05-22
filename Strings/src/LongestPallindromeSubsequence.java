
public class LongestPallindromeSubsequence {
	
	
	static StringBuilder sb= new StringBuilder();
	
	
	public static void main(String[] args)
	{
		System.out.println(findPalindrome("Hoome"));
	}
	
	
	static String findPalindrome(String data)
	{ 
		
		for(int count=0;count<data.length();count++)
		{
			longestSubsequence(data,count,count);
			longestSubsequence(data,count,count+1);
		}
		
		return sb.toString(); 
	}

	private static void longestSubsequence(String data, int count, int index) {
		
		while(count>=0&&index<data.length())
		{
			if(data.charAt(count)==data.charAt(index))
			{
				if(index-count+1>sb.length())
				{
					sb.delete(0, sb.length());
					sb.append(data.substring(count, index+1));
				}
				count--;
				index++;
			}
			else{
			break;}
		}
		
	}

}
