package com.greatlearning.Question_2_DSA_Solution;

public class Main {
	
	public static void main(String[] args) {
		Driver tree = new Driver();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		Driver.convertBSTtoSkewed(tree.node);
		System.out.println("The resultant output is :");
		Driver.traverseRightSkewedTree(tree.headNode);
	}
}
