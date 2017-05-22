package com.stack;



public class StackLL {

	Node head;

	void push(int value) {
		if (head == null) {
			head = new Node(value, value);
		} else {
			head = new Node(value, Math.min(value, head.min), head);
		}

	}

	void pop() {

		head = head.next;

	}

	int top() {
		return head.value;
	}

	int getMin() {
		return head.min;
	}

	public static void main(String[] args) {
		StackLL minStack = new StackLL();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());		
		minStack.pop();
		System.out.println(minStack.top());
		System.out.println(minStack.getMin());
	}

	class Node {

		Node next;
		int value;
		int min;

		Node(int value, int min) {

			this(value, min, null);

		}

		Node(int value, int min, Node head) {
			this.value = value;
			this.min = min;
			this.next = head;
		}
	}

}
