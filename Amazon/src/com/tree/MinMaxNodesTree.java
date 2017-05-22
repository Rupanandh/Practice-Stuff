package com.tree;

import com.tree.ATree.TreeNode;

public class MinMaxNodesTree {

	static Node root;

	public static void main(String[] args) {
		MinMaxNodesTree tree = new MinMaxNodesTree();
		int[] data = { 10, 7, 15, 6, 8, 13, 20, 3, 5, 4 };
		for (int i = 0; i < data.length; i++) {
			tree.insert(data[i]);
		}
		System.out.println("Min Node data::" + tree.findMinNode(root).data);
		System.out.println("Tree Height:" + tree.heightOfTree(root));
		System.out.println("Node depth:" + tree.depthOfNode(root, 0, 5));
	}

	void insert(int data) {

		Node node = new Node(data);
		if (root == null) {
			root = node;
			return;
		}

		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (data < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = node;
					return;
				}
			} else {
				current = current.right;
				if (current == null) {
					parent.right = node;
					return;
				}
			}

		}

	}

	Node findMinNode(Node root) {

		Node temp = root;
		Node minNode = null;
		while (temp != null) {
			minNode = temp;
			temp = temp.left;
		}

		return minNode;

	}

	Node findMaxNode(Node root) {
		if (root.right == null) {
			return root;
		}

		return findMaxNode(root.right);

	}

	void minDepthOfTree() {

	}

	void maxDepthOfTree() {

	}

	int depthOfNode(Node root, int level, int data) {
		
		if (root == null)
			return 0;
		else if (data == root.data)
			return level;
		
			int depth=depthOfNode(root.right, level + 1, data);
			if(depth!=0) return depth;
	
		depth=	depthOfNode(root.left, level + 1, data);
		return depth;
	

		
	}

	int heightOfTree(Node root) {

		if (root == null)
			return -1;
		int leftHeight = heightOfTree(root.left);
		int rightHeight = heightOfTree(root.right);

		return Math.max(leftHeight, rightHeight) + 1;
	}

	boolean isTreeBalanced() {

		return false;

	}
	
	
	
	
	int findDistance(TreeNode root, int value1, int value2)
	{
		if (root==null|| value1==value2) return 0;
		
		if((value1>root.data && value2 <root.data)||(value1>root.data && value2 <root.data))
		{
			 return findDistance(root, value2)+findDistance(root, value1);
		}
		else if(value1>root.data && value2 >root.data)
		{
			
			return findDistance(root.right, value1,value2);
		}
		else{
			return findDistance(root.left, value1,value2);
		}
		
	
		
	}

	private int findDistance(TreeNode root, int value1) {
		
		if(root==null||root.data==value1) return 0;
		
		if(value1>root.data)
		{
			return 1+findDistance(root.right, value1);
		}
		else{
			return 1+findDistance(root.left, value1);
		}
		
		
		
		
	}
	
	int findLeastCommonAncesstor(TreeNode node, int value1, int value2)
	{
		return 0;
	}

	public class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

}
