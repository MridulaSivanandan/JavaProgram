package com.ctc.list;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class LinkedListTest {
	@Test
	public void removeDuplicateTest() {
		LinkedList a = new LinkedList();
		a.appendToList(3);
		a.appendToList(3);
		a.appendToList(56);
		a.appendToList(1);
		a.appendToList(3);
		a.appendToList(37);
		a.appendToList(34);
		// "3 3 56 1 3 "-----sequence added and duplicates removed
		RemoveDuplicates r = new RemoveDuplicates();
		LinkedList c = r.remove(a);
		String result1 = c.printList();
		assertEquals(result1, "3 56 1 37 34 ");
	}

	@Test
	public void kthElementToLastTest() {
		LinkedList a = new LinkedList();
		a.appendToList(3);
		a.appendToList(3);
		a.appendToList(56);
		a.appendToList(1);
		a.appendToList(3);
		a.appendToList(37);
		a.appendToList(34);
		KthElementFromLast obj = new KthElementFromLast();
		int result = obj.getKthElementFromElement(a, 2);
		// System.out.println(result);
		assertEquals(result, 37);
	}

	@Test
	public void deleteNodeTest() {
		LinkedList a = new LinkedList();
		a.appendToList(3);
		a.appendToList(56);
		a.appendToList(1);
		a.appendToList(37);
		a.appendToList(34);
		DeleteNode obj = new DeleteNode();
		Node temp = a.getHead();
		Node nodeToBeDeleted = null;
		while (temp != null) {
			if (temp.data == 1) {
				nodeToBeDeleted = temp;
				break;
			}
			temp = temp.next;
		}
		boolean answer = obj.deleteNode(nodeToBeDeleted);
		// String result = a.printList();
		// System.out.println(result);
		assertEquals(answer, true);
	}

	@Test
	public void partitionListTest() {
		LinkedList a = new LinkedList();
		a.appendToList(3);
		a.appendToList(10);
		a.appendToList(56);
		a.appendToList(15);
		a.appendToList(8);
		a.appendToList(89);
		a.appendToList(1);
		a.appendToList(37);
		a.appendToList(34);
		PartitionList obj = new PartitionList();
		Node head = obj.partition(15,a);
		//System.out.println(head);
		a.setHead(head);
		String result = a.printList();
		//System.out.println(result);
		assertEquals(result,"3 10 8 1 56 15 89 37 34 ");
	}

}
