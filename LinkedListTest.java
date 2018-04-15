package com.ctc.list;

import static org.junit.Assert.*;

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
		KthElementFromLast obj=new KthElementFromLast();
		int result=obj.getKthElementFromElement(a,2);
		System.out.println(result);
		assertEquals(result,37);
	}

}
