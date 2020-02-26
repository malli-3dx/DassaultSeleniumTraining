package com.dassault.qa.javalearning;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		List<String> a1 = new ArrayList<String>();
		
		a1.add("Ram");   //0
		a1.add("Shyam"); //1
		a1.add("Laxman"); //2
		a1.add("Rohit"); //3
		a1.add("Rahul"); //4
		a1.add("Ramu"); //5
		
		System.out.println(a1);
		List<String> a2 = new ArrayList<String>();
		
		for(int i=0; i<a1.size(); i++) {
			
			if(remainder(i,2) != 0) {			
				a2.add(a1.get(i));
				
			}				
		}
		
		a2.remove(1);
		
		System.out.println(a2);
		
		
		
//		//Add only odd indexes from a1 into a2
//		for(int i=0,j=0; i<a1.size(); i++) {
//			if(i>0) {
//				if(Integer.remainderUnsigned(i, 2)!=0) {
//					
//					a2.add(j, a1.get(i));
//					j++;
//				}
//			}
//		}
		
		
		
	}

	private static int remainder(int i, int j) {
		return Integer.remainderUnsigned(i, j);
		
	}

}
