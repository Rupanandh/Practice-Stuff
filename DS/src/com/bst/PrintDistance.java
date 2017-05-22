package com.bst;

public class PrintDistance {
	public int findDistance(Node root, int n1, int n2) {
		int x = Pathlength(root, n1) - 1;
		int y = Pathlength(root, n2) - 1;
		int lcaData = findLCA(root, n1, n2).data;
		int lcaDistance = Pathlength(root, lcaData) - 1;
		return (x + y) - 2 * lcaDistance;
	}

	public int Pathlength(Node root, int n1) {
		if (root != null) {
			int x = 0;
			if ((root.data == n1) 
					||(x = Pathlength(root.left, n1)) > 0
					|| (x = Pathlength(root.right, n1)) > 0) {
				 System.out.println(root.data);
				return x + 1;
			}
			return 0;
		}
		return 0;
	}

	public Node findLCA(Node root, int n1, int n2) {
		if (root != null) {
			if (root.data == n1 || root.data == n2) {
				return root;
			}
			Node left = findLCA(root.left, n1, n2);
			Node right = findLCA(root.right, n1, n2);

			if (left != null && right != null) {
				return root;
			}
			if (left != null) {
				return left;
			}
			if (right != null) {
				return right;
			}
		}
		return null;
	}

	public static void main(String[] args) throws java.lang.Exception {
		Node root = new Node(20);
		root.left = new Node(13);
		root.right = new Node(30);
		root.left.left = new Node(10);
		root.left.right = new Node(17);
		root.right.left = new Node(25);
		root.right.right = new Node(40);
		root.left.right.right = new Node(19);
		PrintDistance i = new PrintDistance();
		System.out.println("Distance between 40 and 19 is : "
				+ i.findDistance(root, 19, 40));
	}
}

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}
}