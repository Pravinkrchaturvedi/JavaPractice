package com.design.pattern.basic;

public class WorkWithAnimals {
	
	
	public static void main(String[] args) {
		
		Dog  fido = new Dog();
		
		System.out.println(fido.getName() +" name by default");
		fido.setHeight(4);
		fido.digHole();
		Cat kitty = new Cat();
		kitty.setName("kitty");
		System.out.println("Name  : " + kitty.getName() +" > "+ kitty.getSound() );
		kitty.setWeight(-2);
		
		Dog.changeFixedValue(fido);
		System.out.println("after method :" + fido.getName());
		/*
		 * polymorphism 
		 * 
		 * */
		Animal doggySupertype = new Dog();
	    Animal KittySupertype = new Cat();
	    System.out.println("get Dog Sound "+ doggySupertype.getSound());
	    System.out.println("get cat Sound "+ KittySupertype.getSound());
	    
	    Animal[] animals = new Animal[4];
 		
	   
	    animals[0] = doggySupertype;
	    animals[1] = KittySupertype;
	    
	    System.out.println("get Dog Sound "+ animals[0].getSound());
	    System.out.println("get cat Sound "+ animals[1].getSound());
	    
	    Girrafe girrafe  = new Girrafe();
	    girrafe.setName("dudu");
	    System.out.println(girrafe.getName());
	    
	    
	    
	}
}
