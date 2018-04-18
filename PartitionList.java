package com.ctc.list;

public class PartitionList {
	public Node partition(int d,LinkedList a){
		//partition the linked list based on the integer
		//so we have two linked list
		//one where all elements to the left of the integer
		//another element in the right of the list
		//thus then both are merged together
		Node BeforeStart=null;
		Node BeforeLast=null;
		Node AfterStart=null;
		Node AfterLast=null;
		Node temp=a.getHead();
//		System.out.println(temp);
		while(temp!=null){
			//System.out.println("Inside Function");
			if(temp.data<d){
				if(BeforeStart==null){
				//	System.out.println("Inside BeforeStart");
					//if this is first element of sublist 1 then make it first
					BeforeStart=temp;
					BeforeLast=BeforeStart;
				}
				else{
					//else add it to the existing elements of sublist 1
					BeforeLast.next=temp;
					BeforeLast=temp;
				}
			}
			else{
				//if this is first element of sublist 2 then make it first
				if(AfterStart==null){
					AfterStart=temp;
					AfterLast=AfterStart;
				}
				else{
					//else add it to the existing elements of sublist 2
					AfterLast.next=temp;
					AfterLast=temp;
				}
			}
			temp=temp.next;
		}
		if(BeforeStart==null)
			return AfterStart;
		//merge two lists
		BeforeLast.next=AfterStart;
		return BeforeStart;
	}

}
