package com.ctc.list;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	LinkedList remove(LinkedList a) {
		Set<Integer> set = new HashSet<Integer>();
		LinkedList b = new LinkedList();
		Node temp = a.getHead();
		while (temp != null) {
			if (!(set.contains(temp.data))) {
				b.appendToList(temp.data);
				set.add(temp.data);
			} else {
				temp = temp.next;
			}
		}
		return b;
	}
}
