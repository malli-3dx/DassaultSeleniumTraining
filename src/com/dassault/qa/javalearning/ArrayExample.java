package com.dassault.qa.javalearning;

public class ArrayExample {

	public static void main(String[] args) {

		int[] myArr = {100,23,34,120};
		
		int myNum;
		
		myNum = getLargestNumber(myArr);
		
		System.out.println("Largest Number is: "+myNum);
		
	}

	private static int getLargestNumber(int[] myArr) {
		
		int largestnumber = 0;
		
		for(int i=0; i<myArr.length; i++) {
			
			if(myArr[i] > largestnumber) {
				largestnumber = myArr[i];
			}
			
		}
		
		
		for(int i=0; i<myArr.length; i++) {
			
			if(myArr[i] > largestnumber) {
				largestnumber = myArr[i];
			}
			
		}
		
		return largestnumber;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

//	private static int getLargestNumber(int[] myArr) {
//
//		int largestnumber = 0;
//		
//		for(int i=0; i<4; i++) {
//			
//			int value = myArr[i];
//			
//			if(value >= largestnumber) {
//				largestnumber = value;
//			}
//			
//		}
//		
//		return largestnumber;
//	}

}
