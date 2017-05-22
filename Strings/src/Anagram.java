import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class Anagram {

	static String[] data = { "cat", "tac", "act", "pot", "top", "meow" };
	
	
	public static void main (String[] args)
	{
		LinkedHashMap<String, HashSet<String>> map=findAnagram(data);
		
		for(Map.Entry<String, HashSet<String>> entry:map.entrySet())
		{
			System.out.println(entry.getValue());
		}
	}

	static LinkedHashMap<String, HashSet<String>> findAnagram(String[] words) {
		LinkedHashMap<String, HashSet<String>> dataMap = new LinkedHashMap<String, HashSet<String>>();
		for (String word : words) {

			char[] dataArray = word.toCharArray();
			Arrays.sort(dataArray);
			String key = new String(dataArray).intern();
			if (dataMap.containsKey(key)) {
				HashSet<String> dataset = dataMap.get(key);
				dataset.add(word);
				dataMap.put(key, dataset);
			}

			else {
				HashSet<String> dataset = new HashSet<String>();
				dataset.add(word);
				dataMap.put(key, dataset);
			}

		}
		return dataMap;
	}

}
