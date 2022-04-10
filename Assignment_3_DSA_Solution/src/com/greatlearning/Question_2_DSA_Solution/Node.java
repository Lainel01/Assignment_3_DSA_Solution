package com.greatlearning.Question_2_DSA_Solution;

class Node {
	int val;
	Node left;
	Node right;
	
	Node (int item){
		val = item;
		left = right = null;
	}
}
class Driver{
		
		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;
		static void convertBSTtoSkewed(Node root) {
			
			if (root == null) {
				return;
			}
			
			convertBSTtoSkewed(root.left);
			Node rightNode = root.right;
			Node leftNode = root.left;
			
			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			}
			else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}
			convertBSTtoSkewed(rightNode);
		}
		
	static void traverseRightSkewedTree(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.val + " ");
		traverseRightSkewedTree(root.right);
	}
}
