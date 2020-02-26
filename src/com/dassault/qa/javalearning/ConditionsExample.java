package com.dassault.qa.javalearning;

public class ConditionsExample {

	public static void main(String[] args) {
	
		String s1 = "First";
		String s2 = "Second";
		
		String biggerstring = getBiggerString(s1,s2);
		
		System.out.println("The bigger string is: "+ biggerstring);
		
	}

	private static String getBiggerString(String s1, String s2) {

		if(s1.length()>s2.length()) {
			return s1;
			
		} else if(s1.length()==s2.length()) {
			return "The 2 Strings are Equal";
			
		} else {
			return s2;
		} 
	}
}
