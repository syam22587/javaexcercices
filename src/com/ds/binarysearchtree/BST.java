package com.ds.binarysearchtree;

public class BST {
	Node root;

	public void insertNode(int data) {

		Node newNode = new Node(data);
		// in order to insert the node first we need to find out the exact position
		// where it fits as per the BST rules i.e., if the data is lesser or equal
		// then it should be placed on its left else on its right .

		if (root == null) {
			root = newNode;
		} else {
			Node currentNode = root;
			Node parentNode;

			while (true) {
				parentNode = currentNode;

				if (data < currentNode.data) {
					currentNode = currentNode.left;
					if (currentNode == null) {
						parentNode.left = newNode;
						return;
					}
				} else {
					currentNode = currentNode.right;
					if (currentNode == null) {
						parentNode.right = newNode;
						return;
					}
				}
			}

		}
	}

	public void printTree() {
		// TODO Auto-generated method stub

		Node currentNode = root;
		int i = 1;
		while (currentNode != null) {
			System.out.println(currentNode.toString());
			System.out.println("The " + i++ + " th item in the tree towards left is : " + currentNode.data);
			currentNode = currentNode.left;
		}

	}

	public boolean deleteNode(int data) {

		boolean status = false;

		Node deletingNode = null;
		// deleting data is actually quiet a tricky one as we have to considered so many
		// scenarios in a such a way that, deleting the node shoudnt disturb the BST
		// rule such as smaller vaules should be on the left and greater than the roots
		// or subtree's parent values must be on its right side.

		// it has exactly scenarios to consider

		if (root == null) {
			return status; // ie., tree is empty
		} else {

			// first find if the deleting node is available in the tree

			Node currentNode = root;
			Node parentNode = root;

			while (currentNode.data != data) {
				parentNode = currentNode;
				if (data < currentNode.data) {
					currentNode = currentNode.left;

				} else {
					currentNode = currentNode.right;
				}

				if (currentNode == null)
					return status; // in case currentNode found is not the deleting node then
			}

			deletingNode = currentNode; // assign the matched node to deleting node

			// 1. If the deleting node is leaf node ie., the node we delete doesnt have
			// children nodes

			if (deletingNode.left == null && deletingNode.right == null) {

				if (deletingNode == root) {
					root = null;
				} else if (parentNode.left != null) {
					parentNode.left = null;
				} else {
					parentNode.right = null;
				}

				status = true;
			} else if (deletingNode.right == null) {
				if(deletingNode == root) {
					root = parentNode.left  ; 
					 
				}
			}

			// 2. the node has exactly one child node that is either left child or right
			// child

			// 3. The node has both child nodes so that deletign node should be replaced by
			// its much appropriate node

		}

		return status;
	}
}
