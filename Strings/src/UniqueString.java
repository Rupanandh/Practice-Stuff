import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;


public class UniqueString {

	static String [] stream ={"Rupa","Nandha","Moori","Nandha","Reddy"};
	
	public static void main(String[]args)
	{
		System.out.println(findFirstUniqueString(stream));
	}
	
	
	static String findFirstUniqueString( String [] stream)
	{
		LinkedHashMap<String, Integer> dataMap = new LinkedHashMap<String, Integer>();
		String firstUniqueWord=" ";
		
		for (String word : stream) {
			
			if(dataMap.containsKey(word))
			{
				dataMap.put(word,dataMap.get(word)+1);
			}
			else{
				dataMap.put(word, 1);
			}
			
		}
		
		for(Map.Entry<String, Integer>entry:dataMap.entrySet())
		{
			if(entry.getValue()==1)
			{
				return entry.getKey();
			}
		}
			return firstUniqueWord;
	}
	
}
