package com.dassault.qa.javalearning;

public class Car implements Vehicle {

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "Car";
	}

	@Override
	public void start() {
		int i;
		//Do some good logical work here
		System.out.println("Car is starting");
		
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping");
		
	}
	
	public void openWindows() {
		System.out.println("Opening Car Windows");
	}

}
