package com.linkes.list;

public class LinkedTester {
	
	
	
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList(3);
		list.setBookName("tree");
		LinkedList list4 = new LinkedList(4);
		list4.setBookName("four");
	    list.setNextNode(list4);
		
	    list4.setNextNode(null);
	   
	    LinkedTester linkedTester = new LinkedTester();
	   /* linkedTester.display(list);
	    linkedTester.display(list4);*/
	    linkedTester.linkLength(list);
	    
		
		
	}

	public  void display(LinkedList thisList){
		  
		
		   
		   if(thisList.getNextNode() == null){
			   
			  System.out.println();
			  System.out.println(thisList.getBookName()+"-"+thisList.getData()+"-next node is null");
		   }
		   else System.out.println(thisList.getBookName()+"-"+thisList.getData()+"- "+thisList.getNextNode().toString());
	   }
	
	 public int linkLength(LinkedList headList){
		 
		 int length = 0;
		 
		 while(headList != null){
			 
			 length++;
			 
			 display(headList);
			 headList = headList.getNextNode();
		 }
		 
		 System.out.println(length);
		 return length;
				 
	 }
}
