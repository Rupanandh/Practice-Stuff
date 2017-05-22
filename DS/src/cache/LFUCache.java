package cache;

import java.util.HashMap;

public class LFUCache {
	
	int capacity;
	private LFUNode headNode=null;
	HashMap<Integer,Integer>  valueHash=null;
	HashMap<Integer,LFUNode> nodeHash =null;
	
	LFUCache(int capacity)
	{
		this.capacity=capacity;
		valueHash = new HashMap<Integer, Integer>();
		nodeHash = new HashMap<Integer, LFUNode>();
	}
	
	public void set(int key, int value)
	{
		if(this.capacity==0)
		{
			return;
		}
		
		if(valueHash.containsKey(key))
		{
			valueHash.put(key, value);
		}
		else{
			 if(valueHash.size()<this.capacity)
			 {
				 valueHash.put(key, value);
			 }
			 else {
				 removeLFU();
				 valueHash.put(key, value);
			}
			 addToHead(key);
			 
		}
		
		
	}

	private void increaseCount(int key) {
		LFUNode node=nodeHash.get(key);
		node.KeysHashSet.remove(key);
		if(node.next==null)
		{
			node.next=new LFUNode(node.count+1);
			node.next.prev=node;
			node.next.KeysHashSet.add(key);
		}
		else if (node.next.count==node.count+1) {
			node.next.KeysHashSet.add(key);
		}
		else {
			LFUNode tempNode = new LFUNode(node.count+1);
			tempNode.KeysHashSet.add(key);
			tempNode.prev =node;
			node.next=tempNode;
			
			tempNode.next=node.next;
			node.next.prev=tempNode;
			
		}
		nodeHash.put(key, node.next);
        if (node.KeysHashSet.size() == 0) remove(node);
	}

	

	private void addToHead(int key) {
		if(headNode==null)
		{
			headNode = new LFUNode(0);
			headNode.KeysHashSet.add(key);
			
		}
		else if(headNode.count>0)
		{
			LFUNode newNode = new LFUNode(0);
			newNode.KeysHashSet.add(key);
			newNode.next =headNode;
			headNode.prev =newNode;
			headNode=newNode;
		}
		else {
			headNode.KeysHashSet.add(key);
		}
		nodeHash.put(key, headNode);
		increaseCount(key);
	}

	private void removeLFU() {
		if(headNode==null)
		{
			return;
		}
		int old=0;
		for(int n:headNode.KeysHashSet)
		{
			old=n;
			break;
		}
		
		headNode.KeysHashSet.remove(old);
		if(headNode.KeysHashSet.size()==0)
		{
			remove(headNode);
		}
		nodeHash.remove(old);
		valueHash.remove(old);
		
	}
	
	private void remove(LFUNode node) {
		
		if(node.prev==null)
		{
			headNode =node.next;
		}
		else {
			node.prev.next=node.next;
		}
		if(node.next!=null)
		{
			node.next.prev=node.prev;
		}
	}

}
