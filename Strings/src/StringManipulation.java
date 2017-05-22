import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class StringManipulation {

	
	//find first character that repeats
	
	
	static String input = "testers";
	
	public static void main(String[] args)
	{
		System.out.println(findFirstRepeatedCharacter(input));
		System.out.println(findFirstNonRepeatedCharacter(input));
	}
	
	
	
	static char findFirstRepeatedCharacter(String data)
	{
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		
		char[] charArray = data.toCharArray();
		for (char c : charArray) {
			
			if(map.containsKey(c))
			{
				return c;
			}
			else{
				map.put(c, c);
			}
			
		}	
		
		return 'c';
	}
	
	static char findFirstNonRepeatedCharacter(String data)
	{
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		char[] charArray = data.toCharArray();
		for (char c : charArray) {
			
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else{
				map.put(c, 1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entryset:map.entrySet())
		{
			if(entryset.getValue()==1)
			{
				return entryset.getKey();
			}
		}
		return 'c';
	}
}
