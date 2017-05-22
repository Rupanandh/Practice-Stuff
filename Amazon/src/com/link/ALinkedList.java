package com.link;

import java.util.Stack;

public class ALinkedList {
	
	static Node head;
	
	public static void main(String[] args)
	{
		for(int i=0;i<8;i++)
		{
			
			insert(i);
			
		}
		//reverseLinkedList(head);
		//printLink();
		//reverseLink(head);
		//System.out.println();
		head=recursionLink(head, null);
		printLink();
	}

	public static void insert(int data)
	{
		if(head==null)
			head= new Node(data);
		else
		{
			Node current=head;
			Node parent=null;
			while(true)
			{
				parent=current;
				if(current.next==null){
					parent.next=new Node(data);
					
					return;
				}
				else{
					current=current.next;
				}
			}
		}
	}
	
	public static void printLink()
	{
		Node current=head;
		
		while (true) {
			
			if(current.next==null){
				System.out.print(current.data+" ");
				break;
				
			}
			else{
				System.out.print(current.data+" ");
				current=current.next;
			}
		}
	}
	
	 public static void deleteLinkedist()
	 {
		 
	 }
	 
	 public static void reverseLinkedList(Node node)
	 {
		if(node==null) return;
		Node newNode=null;
		while(node!=null)
		{
			Node temp = node.next;
			node.next=newNode;
			newNode=node;
			node=temp;
		}
		head=newNode;
		 
	 }
	 
	 public static void reverseLink(Node head)
	 {
		 Stack<Node> stacklink = new Stack<Node>();
		 
		 while(head!=null)
		 {
			 Node temp = head.next;
			 head.next=null;
			 stacklink.push(head);
			 head=temp;
		 }
		 
		 Node temp =stacklink.pop();
		 head=temp;
		 while(!stacklink.isEmpty())
		 {
			 temp.next=stacklink.pop();
			 temp=temp.next;
		 }
		ALinkedList.head=head; 
	 }
	 
	 
	 static Node n=null;
	 public static Node recursionLink(Node current, Node previous)
	 {
		 
		 if(current==null) return previous;
		 
		 	Node n1=current.next;
		 	current.next=previous;
		 	previous=current;
		 	current=n1;
		 	
		 return recursionLink(current,previous);
	 }
}
