package com.design.pattern.basic;

public class Dog extends Animal {

	public void digHole() {

		System.out.println("digging hole");

	}

	public Dog() {

		super();
		setName("Dale");
		System.out.println("Instance created  Name is " + getName());
		setSound("bark");
	}
	
	public  static  void changeFixedValue(Dog fido){
		
		fido.setName("markus");
		System.out.println("name in method : " + fido.getName());
	}
}
