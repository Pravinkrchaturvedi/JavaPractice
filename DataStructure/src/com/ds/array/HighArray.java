package com.ds.array;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HighArray {

	
	public static void main(String[] args) {
		String words = "love the wayyou lie love" ; 
		String patt = "love";
	    String patt2 = "\\w";
		Pattern pattern = Pattern.compile(patt);
		Matcher match = pattern.matcher(words);
		System.out.println(words);
		while(match.find()){
		   System.out.println("Found"+patt+" at: "+ match.start());
		    
		  System.out.println(match.group());
		}
		
		
		
	}
}