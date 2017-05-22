package com.link;

public class LinkedList {

	public Node headNode = null;
	public Node currentNode = null;
	public Node tailNode = null;
	public int length = 0;

	public void addNode(String data) {
		Node newNode = new Node(data, null);

		if (currentNode != null) {
			currentNode.nextNode = newNode;
			currentNode = newNode;

		} else {

			currentNode = newNode;
			headNode = currentNode;
		}

		length++;
	}

	public void removeNode() {

		headNode = headNode.nextNode;

	}

	public Node removeNode(String data) {
		Node tempNode =headNode;
		if(headNode==null)
			return headNode;
		
		while(tempNode.nextNode!=null)
		{
			if(tempNode.nextNode.data==data) tempNode.nextNode=tempNode.nextNode.nextNode;
			else tempNode=tempNode.nextNode;
		}
		
		return headNode.data==data?headNode.nextNode:headNode;

	}

	public void print(Node dataNode) {

		Node tempNode = dataNode;
		while (tempNode != null) {
			System.out.println(tempNode.toString());
			tempNode = tempNode.nextNode;
		}
	}

}
