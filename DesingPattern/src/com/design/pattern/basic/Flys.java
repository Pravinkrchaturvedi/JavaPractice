package com.design.pattern.basic;

public interface Flys {
	
	String fly();
	
}

  class ItFlys implements Flys {

	public String fly() {
		// TODO Auto-generated method stub
		System.out.println("it flys");
		return "Flying high";
	}}
class CantFly implements Flys{
	
	public String fly(){
		
		return " i can't fly";
	}
}

