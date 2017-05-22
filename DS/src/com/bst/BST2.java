package com.bst;

public class BST2 {

	static TreeNode root;

	public static void main(String[] args) {
		int[] values = { 40, 35, 50, 30, 15, 60, 45, 38, 20, 33 };
		for (int val : values) {
			insert(val);
		}
		// System.out.println("Distance between Nodes: "+findDistance(root, 33,
		// 20));
		// System.out.println("Distance from root to node: "+distance(root,
		// 33));
		System.out.println("Distance from root to Node: " + distance(root, 2));
		// System.out.println("LCA:"+findLCA(root, 33, 20));
	}

	public static void insert(int data) {
		TreeNode newNode = new TreeNode(data);
		if (root == null) {
			root = newNode;
			return;
		}
		TreeNode current = root;
		TreeNode parent = null;
		while (true) {
			parent = current;
			if (current.data > data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}

	}

	public static int findDistance(TreeNode root, int value1, int value2) {

		if (root == null || value1 == value2) {
			return 0;
		} else if (root.data >= value1 && root.data <= value2
				|| root.data <= value1 && root.data >= value2) {
			return distance(root, value1) + distance(root, value2);
		} else if (root.data < value1 && root.data < value2) {
			return findDistance(root.right, value1, value2);
		} else {
			return findDistance(root.left, value1, value2);
		}

	}

	private static int distance(TreeNode root, int value1) {
		
		if (root == null) {
			return -1;
		} if (root.data == value1) {
			return 0;	}

		
			int dist1 =  distance(root.left, value1);
	
			int dist2 = distance(root.right, value1);
			 if(dist1 == -1 && dist1 == -1) 
			        return -1;
		
		return 1+Math.max(dist1, dist2);
	}

	private static int findLCA(TreeNode root, int value1, int value2) {
		if (root == null || value1 == value2) {
			return 0;
		} else if (root.data >= value1 && root.data <= value2
				|| root.data <= value1 && root.data >= value2) {
			return root.data;
		} else if (root.data < value1 && root.data < value2) {
			return findLCA(root.right, value1, value2);
		} else {
			return findLCA(root.left, value1, value2);
		}

	}

	static class TreeNode {
		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			left = null;
			right = null;
		}
	}
}
