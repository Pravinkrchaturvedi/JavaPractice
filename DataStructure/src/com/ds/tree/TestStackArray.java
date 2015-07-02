package com.ds.tree;

public class TestStackArray {

	static long [] A = {3,4,4,9,8 ,10};
	
	public static void main(String[] args) {
		
		Stack stack = new Stack(10);
		for(int i = 0 ; i < A.length; i++){
			//stack.peek();
			stack.push(A[i]);
			stack.peek();
			//stack.isFull();
			
			
			
		}
		stack.pop();
		stack.peek();
		stack.pop();
		stack.peek();
		
		
		
		
		
	}
}
