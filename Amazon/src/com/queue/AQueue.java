package com.queue;

public class AQueue {

	static QueueNode head;
	
	public static void main(String [] args) {
		AQueue queue = new AQueue();
		for(int i=0; i<=8;i++)
		{
			queue.add(i);
		}
		//queue.printQueue();
		System.out.println(queue.peek());
		System.out.println(queue.remove());
		System.out.println(queue.removeLast());
		queue.printQueue();
	}

	public void add(int data) {
		QueueNode newNode = new QueueNode(data);
		;
		if (head == null) {
			head = newNode;
		} else {
			QueueNode currenthead = head;
			QueueNode parentNode = null;
			while (true) {
				parentNode = currenthead;
				if (currenthead.next == null) {
					parentNode.next = newNode;
					return;
				} else {
					currenthead = currenthead.next;
				}
			}
		}

	}

	public int remove() {
		int data = head.data;
		head = head.next;
		return data;
	}
	
	public int removeLast()
	{
		QueueNode currenthead = head;
		QueueNode parentNode = null;
		while (true) {
			parentNode = currenthead;
			if (currenthead.next == null) {
				int data =parentNode.data;
				parentNode = null;
				return data;
			} else {
				currenthead = currenthead.next;
			}
		}
	}

	public int peek() {

		return head.data;
	}
	
	
	public void printQueue()
	{
		while(head!=null){
			System.out.print(head.data);
			head=head.next;
		}
	}

	class QueueNode {
		int data;
		QueueNode next;

		public QueueNode(int data) {
			this.data = data;
			next = null;

		}
	}

}
