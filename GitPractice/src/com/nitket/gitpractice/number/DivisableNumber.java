package com.nitket.gitpractice.number;

import java.util.Scanner;

public class DivisableNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("please enter your number");
		int a = scan.nextInt();
		scan.close();
		 if(a%3==0 && a%5==0) {
			 
			 System.out.println("awesome");
		 }else if(a%3==0){
			 
			 System.out.println("woo");
		 }else if(a%5==0){
			 System.out.println("ohh");
		 }else
			 System.out.println("nothing");
		
		
	}

}
