package com.link;

public class Executor {

	public static void main(String[] args) {
		LinkedList linkedList = new LinkedList();
		
		linkedList.addNode("Rupa");
		linkedList.addNode("RupaNandha");
		linkedList.addNode("naandha");
		linkedList.addNode("Moori");
		linkedList.addNode("Rupa");
		
		//linkedList.print();	
		
		linkedList.print(linkedList.removeNode("Rupa"));
		
		//linkedList.removeNode("");

	}

}
