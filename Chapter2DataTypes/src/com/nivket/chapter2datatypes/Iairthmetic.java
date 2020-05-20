package com.nivket.chapter2datatypes;

public interface Iairthmetic {

	
	
	int sum(int a, int b);

	public static void main(String[] args) {

		Iairthmetic labma = (int a, int b) -> {

			return a + b;
		};
		
     System.out.println(labma.sum(4, 5));
	}

}