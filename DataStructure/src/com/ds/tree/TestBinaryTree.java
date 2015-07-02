package com.ds.tree;

public class TestBinaryTree {
	
	static int [] key = {11,3,4,20,7,5,4};
	static double [] data = {2.5 , 3.5 ,6.6 , 7.7,8.6,1.1,2.2};
	
	public static void main(String[] args) {
		
		BinaryTree bt = new BinaryTree();
		
		for(int i = 0 ; i< key.length ; i++){
			bt.insertWithData(key[i], data[i]);
			//bt.searchNode(key[i]);
			
			bt.findDepth(key[i]);
		}
		bt.findMinimumNode();
		bt.findMaxNode();
		bt.searchNode(20);
	
		
	}
	

}
