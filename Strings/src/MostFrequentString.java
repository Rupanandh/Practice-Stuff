import java.util.HashMap;
import java.util.Map;


public class MostFrequentString {
	
	
	static String [] stream ={"Rupa","Nandha","Moori","Rupa","Nandha"};
	
	public static void main(String[] args)
	{
		System.out.println(findMostFrequentString(stream));
	}
	static String findMostFrequentString(String[] stream)
	{
		String mostFrequentWord=" ";
		int mostFrequentCount=0;
		HashMap<String,Integer> dataMap = new HashMap<String, Integer>();
		
		for(String word:stream)
		{
			
			if(dataMap.containsKey(word))
			{
				dataMap.put(word, dataMap.get(word)+1);
			}
			else{
				dataMap.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:dataMap.entrySet())
		{
			if(mostFrequentCount<=entry.getValue())
			{
				mostFrequentCount=entry.getValue();
				mostFrequentWord=entry.getKey();
			}
		}
		
		return mostFrequentWord;
		
		
	}

}
