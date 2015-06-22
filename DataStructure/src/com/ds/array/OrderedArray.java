package com.ds.array;

public class OrderedArray {

	int orderedArray[] = {3 , 6 , 9 , 20 , 25,16};
	
	
	public int searchKey(int key){
		
		int lowerBound = 0 ;
		int upperBound = orderedArray.length;
	    boolean notFound = true;
	    int currIndex ;
	    int response = 0 ;
		while(notFound){
		 currIndex = (lowerBound+upperBound)/2;
		 if(orderedArray[currIndex]==key){
			 return response = currIndex;
			 
		 }else if(lowerBound > upperBound ){
			 
			 return response;
		 }
		  if(key > orderedArray[currIndex]){
			  
			  lowerBound = currIndex+1;
		  }
		  else  upperBound = currIndex-1;
		}
		
		
		return response;
		
	}
}
