package com.ds.tree;

import java.util.Scanner;

public class Tree {
	
	static final Node root = new Node();
	
	
	public static void main(String[] args) {
		 root.number = 4 ; 
		 Node node = new Node();
		 Node rightNode = new Node();
		// root.left = leftNode;
		 root.right = rightNode;
		 addNode(root ,new Node() , 5);
		 addNode(root ,new Node() , 3);
		 addNode(root ,new Node() , 4);
		 printNode(root);
	}
	
	private static void printNode(Node node){
		
		System.out.println(" data : "+ node.number);
		if(node.right != null){
		 printNode(node.right);}
		 if(node.left !=null){
		 printNode(node.left);}
		
	
	}
	
	private static void addRightNode(Node perentNode,int data){
		if(perentNode.right == null){
			Node node = new Node();
			node.number = data ;
			System.out.println("right Child added " + data);
			perentNode.right = node;}
		else System.out.println("right child node already exist");
	}
	
	private static void addLefttNode(Node perentNode , int data){
		if(perentNode.left == null){
			Node node = new Node();
			node.number = data ;
			System.out.println("left child added " + data);
			perentNode.left = node;}
			else System.out.println("left child node already exist");
		}
	
	private static void addNode(Node perentNode ,Node nodeToAdd , int data){
		if(perentNode.number >= data){
			addLefttNode(perentNode, data);
		}else if(perentNode.number < data){
		   addRightNode(nodeToAdd, data);
		}
		}
	
	
		
		
		
		
	}
	
	


