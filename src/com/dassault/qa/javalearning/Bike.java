package com.dassault.qa.javalearning;

public class Bike implements Vehicle {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Bike";
	}

	@Override
	public void start() {
		int i;
		//Do some good logical work here
		System.out.println("Bike is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Bike is stopping");
		
	}

}
