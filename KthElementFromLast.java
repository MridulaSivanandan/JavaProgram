package com.ctc.list;

public class KthElementFromLast {
	 int getKthElementFromElement(LinkedList a, int k) {
		int result=0;
         Node ahead=a.getHead();
         Node behind=a.getHead();
         for(int i=0;i<k;i++){
        	 ahead=ahead.next;
         }
         while(ahead!=null){
        	 ahead=ahead.next;
        	 behind=behind.next;
         }
         result=behind.data;
         System.out.println(result);
         return behind.data;
	}
	}
