package com.link;

public class Node {
	
	public String data;
	public Node nextNode;
	
	public Node(String data, Node address)
	{
		this.data=data;
		this.nextNode=address;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
	
	

}
