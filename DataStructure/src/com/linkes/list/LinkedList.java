package com.linkes.list;

public class LinkedList {
	
	private String bookName ;
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	private LinkedList nextNode;
	public LinkedList getNextNode() {
		return nextNode;
	}
	
	public LinkedList(int data){
		
		this.data = data ;
	}
	public void setNextNode(LinkedList nextNode) {
		this.nextNode = nextNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	private int data;
	
   
   
}
