package com.tree;

import java.util.LinkedList;
import java.util.Queue;

import com.tree.ATree.TreeNode;

public class LevelOrder {

	Queue<TreeNode> levelQueue = new LinkedList<TreeNode>();

	void levelOrderTraversal(TreeNode root) {

		if (root == null)
			return;
		levelQueue.add(root);
		

		while (!levelQueue.isEmpty()) {
			int size = levelQueue.size();
			for (int i = 0; i < size; i++) {
				TreeNode node = levelQueue.poll();
				System.out.print(node.data + " ");
				if (node.left != null) {
					levelQueue.add(node.left);
				}
				if (node.right != null) {
					levelQueue.add(node.right);
				}
			}
			System.out.println();

		}

	}

}
