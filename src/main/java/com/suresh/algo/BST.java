package com.suresh.algo;

import java.util.Stack;

public class BST {
	private static class Node {
		private int data;
		private Node left,right;
		
		public Node(int value) {
			data = value;
			left = right =null;
		}
	}
	private Node root;
	
	public BST() {
		root = null;
	}
	
	public Node getRoot() {
		return root;
	}
	
	/**
	 * Time complexity is o(1)
	 * @return
	 */
	public boolean isEmpty() {
		return null == root;
	}
	
	/**
	 * Time Complexity is o(n)
	 * @return
	 */
	public int size() {
		Node current = root;
		int size = 0;
		Stack<Node> stack = new Stack<Node>();
		while(!stack.isEmpty() || current != null) {
			if(current!=null) {
				stack.push(current);
				current = current.left;
			}else {
				size++;
				current=stack.pop();
				current = current.right;
			}
		}
		return size;
	}
	/**
	 * Time Complexity is o(1)
	 */
	public void clear() {
		root = null;
	}

}
