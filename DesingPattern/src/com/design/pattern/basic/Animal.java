package com.design.pattern.basic;

public class Animal {

	private String name; 
	private int weight ;
	private double height ;
	private String sound;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		if(weight > 0){
			this.weight = weight;
			
		}
		else {System.out.println("weight shouldn't be less in negative");}
		
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	
	
	/*public void canFly(){
		
		System.out.println("i can fly");
	}*/
	
}
