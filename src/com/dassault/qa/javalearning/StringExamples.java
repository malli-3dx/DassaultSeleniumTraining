package com.dassault.qa.javalearning;
public class StringExamples {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		
		Human h3 = new Human();
		
		h3.name = "John";
		//h3.sex = 'M';
		h3.age = 45;

		String firstname = " Ameya ";
		String lastname = "Naik";
		
		char[] fname = {'A','m','e','y','a'};
		
		int lengthoffirstname;
		lengthoffirstname = firstname.length();
		
		int lengthoflastname = lastname.length();
		
		System.out.println(lengthoffirstname);
		System.out.println(lengthoflastname);
		
		//firstname = firstname.
		//System.out.println(firstname.equals(fname));
		
		//System.out.println(firstname.length());
		
//		System.out.println("The length of first name is: "+firstname.length());
//		
//		System.out.println("Full name is: "+firstname+" "+lastname);
//		
//		System.out.println("Full name using concat is: "+firstname.concat(" ").concat(lastname));
//		
//		System.out.println("Full name in CAPS is: "+firstname.toUpperCase()+" "+lastname.toUpperCase());
//		
//		System.out.println("Length of Full name is: "+ (firstname.length()+lastname.length()));
	}

}
