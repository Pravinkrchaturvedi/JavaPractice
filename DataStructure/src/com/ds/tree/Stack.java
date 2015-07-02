package com.ds.tree;

public class Stack {
	
	private int stackSize;
	private long[] stackArray ;
	private int top ;
	
	public Stack(int size) {
		stackSize =size;
	    stackArray = new long[stackSize];
		top = -1;
		
	}
	
	
	public void push(long data){
		if(isFull()){
			System.out.println("Stack Overflow");
		}else{
			System.out.println("display pushed : " +data);
		stackArray[++top] = data;}
		
	}
	
	
	public long pop(){
		
		if(isEmpty()){
			
			System.out.println("Stack UnderFlow data to peek");
			return top; 
		}else {
			long  data  =stackArray[top--];
			System.out.println("display popped : " +data);
			return data; }
		
		
		
	}
	public boolean isEmpty(){
		
		return (top == -1) ;
		
		
	}
	
	public boolean isFull(){
		
		return (top == stackSize-1);
	}
	
	public long peek(){
		long topPeek  =stackArray[top];
		System.out.println("Latest Top "+ topPeek );
		return topPeek;
	}

   public void display(long data){
	   
	   System.out.println(data);
   }
   
   /*public void displayStack(){
	   int index = top;
	   while(index == -1){
		   
		   peek();
		   
		   index--;
	   }
	   
   }*/
	
}
