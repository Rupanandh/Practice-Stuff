package com.tree;

public class ATree {

	static TreeNode root;
	
	
	public static void main(String[] args)
	{
		int[] dataArray ={30,25,40,20,27,35,50,45,60};
		LevelOrder level = new LevelOrder();
		for (int i=0; i<dataArray.length;i++)
		{
			insert(dataArray[i]);
		}
				//inOrderTraversal(root);
				//delete(root, 50);
				//System.out.println();
				//inOrderTraversal(root);
				level.levelOrderTraversal(root);
	}

	public static void insert(int data) {

		TreeNode node = new TreeNode(data);
		if (root == null) {
			root = node;
			return;
		}

		TreeNode currentRoot = root;
		TreeNode parentnode = null;
		while (true) {
			parentnode = currentRoot;
			if (currentRoot.data > data) {
				currentRoot = currentRoot.left;
				if (currentRoot == null) {
					parentnode.left = node;
					return;
				}
			} else {
				currentRoot = currentRoot.right;
				if (currentRoot == null) {
					parentnode.right = node;
					return;
				}
			}

		}
	}

	public static TreeNode  delete(TreeNode root, int data) {

		if (root == null)
			return root;

		else if (data > root.data) {
			root.right = delete(root.right, data);
		} else if (data < root.data) {
			root.left = delete(root.left, data);
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				TreeNode node = findMinimumNode(root.right);
				root.data=node.data;
				root.right = delete(root.right, root.data);
			}
		}
		return root;
	}

	private static TreeNode findMinimumNode(TreeNode root) {

		while (root.left != null) {
			root = root.left;
		}

		return root;
	}
	
	
	private static void inOrderTraversal(TreeNode root)
	{
		if(root==null) return;
		inOrderTraversal(root.left);
		System.out.print(root.data+" ");
		inOrderTraversal(root.right);
			
	}

	public static class TreeNode {

		int data;
		TreeNode left;
		TreeNode right;

		TreeNode(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}

}
