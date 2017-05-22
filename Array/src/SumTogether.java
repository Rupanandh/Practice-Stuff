import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class SumTogether {
	
	static int [] nums ={1,2,3,4,5,0};
	
	public static void main(String[] args)
	{
		Map<Integer, ArrayList<Integer>> datas=findNums(nums, 5);
		
		for(Map.Entry<Integer, ArrayList<Integer>> data:datas.entrySet())
		{
			
			
		
			System.out.print(data.getValue()+" ");
				
		}
	}
	
	
	static Map<Integer,ArrayList<Integer>> findNums(int[] nums, int target)
	{
		
		HashMap<Integer, ArrayList<Integer>> dataset = new HashMap<Integer, ArrayList<Integer>>();
		HashMap<Integer,Integer> dataMap = new HashMap<Integer,Integer>();
		
		for(int num:nums)
		{
			dataMap.put(num,num);
			
		}
		
		for(Map.Entry<Integer, Integer> entry:dataMap.entrySet())
		{
			
			int key =target-entry.getKey();
			
			if(dataMap.containsKey(key))
			{   
				ArrayList<Integer> al = new ArrayList<Integer>();
				al.add(key);
				al.add(entry.getKey());
				
				dataset.putIfAbsent(Math.abs(key-entry.getKey()), al);
				
				
				
			}
		}
		return dataset;
	}

}
