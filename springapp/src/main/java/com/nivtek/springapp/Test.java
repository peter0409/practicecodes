/**
 * 
 */
package com.nivtek.springapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Bootcamp User 007
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//implementation class .               loading the ioc container
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.nivtek.springapp");
	
	//using getBean() we requesting the container to provide samplebean reference.
		
		SampleBean sampleBean=applicationContext.getBean(SampleBean.class);
	
		System.out.println(sampleBean.greet());
	
	
	
	}

}
