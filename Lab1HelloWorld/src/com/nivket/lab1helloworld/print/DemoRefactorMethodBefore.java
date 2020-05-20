package com.nivket.lab1helloworld.print;

public class DemoRefactorMethodBefore {

	String name;
	String city;
	String state;

	public void print(String name, String city, String state) {
		/*
		 * name = n; city = c; state = s;
		 */
		this.name=name;
		this.city=city;
		this.state=state;
		
		System.out.println("Hello, My name is" + name);
		System.out.println("I live in" +city +"," + state);
        System.out.println("I am a java instructor \nI work for Nivtek\n");
        
	}

	public int add(int i, int j) {

		return i + j;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DemoRefactorMethodBefore b = new DemoRefactorMethodBefore();
		b.print("jnjn", "kmkmk", "kmkjkj");
		b.print("jnjn", "kmkmk", "kmkjkj");
		b.print("jnjn", "kmkmk", "kmkjkj");
		int k = b.add(5, 6);
		System.out.println(k);
	}

}
