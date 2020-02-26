package com.dassault.qa.javalearning;

public class Human {
	
	//Properties of the class (Instance Variables)
	String name;
	private char sex;
	protected int age;
	float height = 6.1f;
	int i;
	static String description = "I am a Human";
	static int count = 0;
	
	public Human() {
		count++;
		name = "default";
	}
	
	Human(String n) {
		count++;
		name = n;
	}
	
	//Behaviors of the class
	
	private void walk() {
		
		i = i+1;
		System.out.println(name + " is walking");
	}
	
	public void talk() {
		//Local Variable
		System.out.println(name + " is talking");
	}
	
	public void run() {
		System.out.println(height);
	}

	public static void main(String[] args) {

		Human h1 = new Human();
		h1.name = "Ameya";
		h1.sex = 'M';
		h1.age = 38;
		//Human.name = "Ameya";
		Human.description = "I am NOT a Human";
		
		
		Human h2 = new Human();
		h2.name = "Ganesh";
		h2.sex = 'M';
		h2.age = 45;
		
		h1.walk();
		//count++;
		h2.talk();
		//count++;
		
		Human h3 = new Human();
		//h3.count++;
		System.out.println("Total number of Humans so far: " + count);
		h3.walk();
		
		Human h4 = new Human();
		//count++;
		Human h5 = new Human();
		//count++;
		System.out.println("Total number of Humans so far: " + count);
		
		Human h6 = new Human("Mark");
		h6.talk();
		
		
		
	}

}
