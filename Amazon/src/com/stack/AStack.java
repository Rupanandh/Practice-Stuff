package com.stack;

public class AStack {

	public static void main(String[] args) {
		AStack stack = new AStack();
		for (int i = 4; i >= -1; i--) {

			stack.push(i);
		}
		System.out.println("min value::" + stack.min());
		System.out.println("Top value:" + stack.peek());
		System.out.println("pop value:" + stack.pop());
		stack.push(-8);
		System.out.println("min value::" + stack.min());

	}

	static StackNode head;

	public int pop() {
		if (head != null) {
			int data = head.data;
			head = head.next;
			return data;
		} else {
			return 0;
		}
	}

	public void push(int data) {

		if (head == null) {
			StackNode currentHead = new StackNode(data, data);
			currentHead.next = head;
			head = currentHead;
		} else {
			StackNode currentHead;
			if (head.min > data) {
				currentHead = new StackNode(data, data);
			} else {
				currentHead = new StackNode(data, head.min);
			}
			currentHead.next = head;
			head = currentHead;
		}

	}

	public int peek() {

		return head.data;
	}

	public int min() {
		return head.min;
	}

	class StackNode {
		int data;
		StackNode next;
		int min = 0;

		public StackNode(int data, int min) {
			this.data = data;
			this.min = min;
			next = null;
		}

	}

}
