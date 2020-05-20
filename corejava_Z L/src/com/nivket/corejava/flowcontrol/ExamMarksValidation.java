package com.nivket.corejava.flowcontrol;

import java.util.InputMismatchException;
import java.util.Scanner;

	
	public class ExamMarksValidation{
		
		static final String PASSED_MESSAGE = "Passed Successfully!";
		static final String FAILED_MESSAGE = "Failed! The range of the qualifying exam marks is between 65 and 100";
		
		
		public static void main(String[] args) {
			
			System.out.println("Please enter your mark:");
			Scanner scan = new Scanner(System.in);
			try{
				int mark = scan.nextInt();
				
				ExamMarksValidation validation = new ExamMarksValidation();
				boolean hasPassed = validation.hasPassed(mark);
				
				String message = "";
				
				if(hasPassed) {
					message = PASSED_MESSAGE;
				}
				else {
					message = FAILED_MESSAGE;
				}
				
				System.out.println(message);
			}catch(InputMismatchException e) {
				System.out.println("Please start over and enter a valid number");
				e.printStackTrace();
			}	
			
		}
		
		public boolean hasPassed(int qualifyingExamMarks) {
			if(qualifyingExamMarks >= 65 && qualifyingExamMarks <= 100) {
				return true;
			}
			else {
				return false;
			}
		}
	}
