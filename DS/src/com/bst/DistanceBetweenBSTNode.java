package com.bst;
public class DistanceBetweenBSTNode{

public int distance(TreeNode root, TreeNode node1,TreeNode node2){
	if(root == null || node1 == node2)
		return 0;
	if(root.val >= node1.val && root.val <= node2.val)
		return distance(root,node1) + distance(root,node2);
	else if(root.val < node1.val && root.val < node2.val)
		return distance(root.right,node1,node2);
	else{
		return distance(root.left,node1,node2);
	}
}

public int distance(TreeNode root, TreeNode node1){
	if(root == node1)
		return 0;
	if(root.val < node1.val){
		return 1+ distance(root.right,node1);
	}
	else{
		return 1+ distance(root.left,node1);
	}
}


public static void main(String[] args){
	DistanceBetweenBSTNode dbb = new DistanceBetweenBSTNode();
	TreeNode root = new TreeNode(5);
	root.left = new TreeNode(3);
	root.right =  new TreeNode(10);
	root.right.right = new TreeNode(11);
	root.right.left = new TreeNode(8);
	//dbb.inorder(root);
	System.out.println(dbb.distance(root,root,root.right.right));
	
}
}