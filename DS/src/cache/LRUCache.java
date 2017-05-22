package cache;

import java.util.LinkedHashMap;

import com.sun.glass.ui.View.Capability;
import com.sun.org.apache.bcel.internal.generic.CPInstruction;

public class LRUCache extends LinkedHashMap<Integer, Integer> {
	
	
	
	private int capacity;

	public LRUCache(int capacity) {
		super(capacity,0.75f,true);
	}
	
	
	
	public Integer get(Object key) {
		
		return super.getOrDefault(key, -1);
	}
	
	 
	public Integer set(Integer key, Integer value) {
		
		return super.put(key, value);
	}	
	
 @Override
protected boolean removeEldestEntry(
		java.util.Map.Entry<Integer, Integer> eldest) {
	
	return super.size()>capacity;
}
}
