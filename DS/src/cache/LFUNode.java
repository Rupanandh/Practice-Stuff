package cache;

import java.util.LinkedHashSet;

public class LFUNode {
	
	int count;
	
	LFUNode prev,next;
	LinkedHashSet<Integer>KeysHashSet=null;
	
	LFUNode(int data)
	{
		this.count=data;
		KeysHashSet = new LinkedHashSet<Integer>();
		prev=null;
		next=null;
	}

}
