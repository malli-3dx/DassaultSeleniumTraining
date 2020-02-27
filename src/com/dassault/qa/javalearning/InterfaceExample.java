package com.dassault.qa.javalearning;

public class InterfaceExample {

	public static void main(String[] args) {

		Vehicle v1 = new Car();
		System.out.println(v1.getType());
		v1.start();
		v1.stop();
		//v1.openWIndows();
		
		v1 = new Bike();
		
		Vehicle v2 = new Bike();
		System.out.println(v2.getType());
		
		Car c1 = new Car();
		System.out.println(c1.getType());
		c1.start();
		c1.stop();
		c1.openWindows();
		
	}

}
