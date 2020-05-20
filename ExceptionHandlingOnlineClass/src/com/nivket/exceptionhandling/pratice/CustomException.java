package com.nivket.exceptionhandling.pratice;

import java.util.Scanner;

/**
 * This is where we defined our custom exception
 * @author LeiZhao
 *
 */
class StudentNotFoundException extends Exception {
	 
    public StudentNotFoundException(String message ,Throwable err) {
        super(message ,err);
    }
}

/**
 * 
 * Class with Main method where we have the StudentNotFoundException
 * @author Peter
 *
 */
public class CustomException{
	public static void main(String[] args) {
		
		CustomException custException = new CustomException();
		try {
			Throwable err = null;
			//some operation null.getValue(); => nullPo
			throw new StudentNotFoundException("Student Not Found!", err);
			
		} catch (StudentNotFoundException e) {
			e.printStackTrace();
		}
		 
		
	    
	}
}