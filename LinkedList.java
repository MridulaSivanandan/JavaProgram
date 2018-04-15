package com.ctc.list;


class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		next = null;
	}
}

public class LinkedList {
	private Node head;

	void appendToList(int data) {
		Node end = new Node(data);
        if(getHead()==null)
        	setHead(end);
        else{
        	Node temp=getHead();
        	while(temp.next!=null){
        		temp=temp.next;
        	}
        	temp.next=end;
        }
	}
	String printList(){
		Node temp=getHead();
		String result = "";
		while(temp!=null){
			//System.out.println(temp.data);
			result+=temp.data+" ";
			temp=temp.next;
		}
		return result;
	}
	public Node getHead() {
		return head;
	}
	public void setHead(Node head) {
		this.head = head;
	}

}
