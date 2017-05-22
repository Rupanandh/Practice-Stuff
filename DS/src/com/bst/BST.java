package com.bst;

import com.bst.BST2.TreeNode;




public class BST {

	static RootNode root;
	
	
	public static void main(String[] arags)
	{
		int [] values = {40,35,50,30,15,60,45,38,20,33};
		for (int val:values)
		{
			insert(val);
		}
		System.out.println(findDistance(root, 33, 20));
	
		
	}
	
	 

	public static void insert(int value) {
		RootNode newNode = new RootNode(value);

		if (root == null) {
			root = newNode;
			return;
		}
		RootNode current = root;
		RootNode parent = null;

		while (true) {
			parent = current;
			if (value <= current.value) {
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
	
	
	static int findDistance( RootNode root, int value1, int value2)
	{
		
		 if(root==null||value1==value2)
		 {
			 return 0;
		 }
		 else if((root.value>=value1&&root.value<=value2)
				 ||(root.value<=value1&&root.value>=value2)){
			 return distance(root,value1)+distance(root,value2);
		 }
		 else if(root.value>value1&&root.value>value2)
		 {
			 return findDistance(root.left, value1, value2);
		 }
		 else{
			 return findDistance(root.right, value1, value2);
		 }
		
		
		
	}

	public static int distance(RootNode root, int value1) {
		
		
		if(root.value==value1)
		{
			return 0;
		}
		else if(root.value>value1)
		{
			return 1+distance(root.left, value1);
		}
		else{
			return 1+distance(root.right, value1);
		}
		
	}

	static class RootNode {

		int value;
		RootNode left;
		RootNode right;

		RootNode(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
}