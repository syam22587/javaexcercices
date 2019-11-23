package com.ds.heap;

public class Heap {

	private Node[] heapArray;

	int currentIndex = 0;

	private int maxSize;

	public Heap(int maxSize) {
		super();
		this.maxSize = maxSize;
		heapArray = new Node[maxSize];
	}

	public boolean isHeapEmpty() {
		return currentIndex == 0;
	}

	public boolean isHeapFull() {
		return currentIndex == maxSize;
	}

	// To insert node

	public void insertNode(int data) {

		Node newNode = new Node(data);

		if (isHeapFull()) {
			System.out.println("Heap is full...better luck next time ... ");
			return;
		} else {
			heapArray[currentIndex] = newNode;
			trickleUp(currentIndex);
			currentIndex++;
		}

		displayHeap(data, " adding ");

	}

	// To Delete the node in heap..Remember in Heap its always the top node in the
	// tree thats going to be deleted

	public void removeNode() {

		int removeData = heapArray[0].getKey();
		if (!isHeapEmpty()) {
			heapArray[0] = heapArray[currentIndex - 1];
			currentIndex--;
			trickleDown(0);
			displayHeap(removeData, " Removing ");

		} else {
			System.out.println("Nothing to delete as the heap is empty.. ");
		}

	}

	private void trickleDown(int i) {

		int top = i;

		int leftChild = 2 * i + 1;
		int rightChild = leftChild + 1;

		System.out.println("left " + leftChild + ", right " + rightChild + " , currentIndex" + i);

		// first check if childs exist
		if ((leftChild < currentIndex && rightChild < currentIndex) && top < currentIndex) {
			System.out.println("asfd");
			// now check the largest child and replace it in the
			// below swaps the node
			if (heapArray[leftChild].getKey() > heapArray[rightChild].getKey()) {
				Node temp = heapArray[top];
				heapArray[top] = heapArray[leftChild];
				heapArray[leftChild] = temp;
				top = leftChild;
			} else {
				Node temp = heapArray[top];
				heapArray[top] = heapArray[rightChild];
				heapArray[rightChild] = temp;
				top = rightChild;
			}

			trickleDown(top);
		}

	}

	// Below displays the tree.

	public void displayHeap(int data, String string) {
		System.out.println("After " + string + " -> " + data);

		for (int i = 0; i < currentIndex; i++) {

			System.out.print("    ->  " + heapArray[i].getKey());
		}
		System.out.println();
	}

	private void trickleUp(int currentI) {

		// This first calculates the currently inserted nodes' parent and then compare
		// till its satisfies the heap structure rule.

		int parentIndex = (currentI - 1) / 2;
		// System.out.println("parent index " + parentIndex);

		if (parentIndex >= 0 && (heapArray[currentI].getKey() > heapArray[parentIndex].getKey())) {

			// System.out.println("parent index " + parentIndex);

			// below swaps the node
			Node temp = heapArray[currentI];
			heapArray[currentI] = heapArray[parentIndex];
			heapArray[parentIndex] = temp;
			currentI = parentIndex;
			// Recursive call
			trickleUp(currentI);
		}

	}
}
