package com.ctc.list;

public class DeleteNode {
	// it is stated that you have access to only that node to be deleted
	// not to previous
	// so copy the next node to the node to be deleted
	public boolean deleteNode(Node nodeToBeDeleted) {
		if ((nodeToBeDeleted == null) || (nodeToBeDeleted.next == null))
			return false;
		Node nextNode = nodeToBeDeleted.next;
		int nextNodeData = nodeToBeDeleted.next.data;
		nodeToBeDeleted.data = nextNodeData;
		nodeToBeDeleted.next = nextNode.next;
		return true;
	}
}
