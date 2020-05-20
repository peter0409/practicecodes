package com.nivtek.hibernatefilter.test;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;

import com.nivtek.hibernatefilter.entity.AirConditioner;
import com.nivtek.hibernatefilter.service.ACCriteriaService;
import com.nivtek.hibernatefilter.service.ACHQLService;
import com.nivtek.hibernatefilter.service.AirConditionerService;


/**
 * @author Bootcamp User 007
 *
 */
public class HibernateFilterTest {

	private ACHQLService filter;
	
	private static AirConditionerService service = new AirConditionerService();
	
	//if flag is true, use HQL, otherwise use Criteria
	public HibernateFilterTest(boolean flag) {
		
		if(flag)
			filter = new ACHQLService();
		else
			filter = new ACCriteriaService();
		
	}
	
	public static void main(String... args) {

		try (Scanner sc = new Scanner(System.in)) {

			boolean flag = setIfHqlOrCriteria(sc);
			
			while (true) {
				
				HibernateFilterTest tf = new HibernateFilterTest(flag);
				
				while(true) {
					
					tf.printFilterInfo();
					
					if (!tf.processFilterOptions(sc)) {
						break;
					}
					
				}
				
				tf.printResults(service.getAirConditioners(tf.filter));
				
				if(!tf.checkifContinue(sc)) 
					break;
				
			}

		} catch (Exception e) {

			e.printStackTrace();

		}

	}
	
	private static boolean setIfHqlOrCriteria(Scanner sc) {
		
		System.out.println("Which query you wanna use? HQL or Criteria");
		
		String input = sc.nextLine().trim();
		
		if(input.equalsIgnoreCase("hql"))
			return true;
		else
			return false;
		
		
	}

	private boolean checkifContinue(Scanner sc) {
		
		System.out.println("------------------------------------------------");
		
		System.out.println("Do you want to search one more time? (yes/no)");
		
		String input = sc.nextLine();
		
		if(input.equalsIgnoreCase("yes"))
			return true;
		
		return false;
		
	}
	
	private void printResults(List<AirConditioner> resultList) {
		
		if(resultList.isEmpty())
			System.out.println("No results found!");
		
		for(AirConditioner ac : resultList) {
			System.out.println(ac);
		}
		
	}

	private boolean processFilterOptions(Scanner sc) throws Exception {
		
		String input = sc.nextLine();
		
		switch(input.trim()){
		
		   case "0" : return false;
		   
		   case "1" : processBrands(sc); return true;
		   
		   case "2" : processCategory(sc); return true;
		   
		   case "3" : processPrice(sc); return true;
		   
		   case "4" : processCapacity(sc); return true;
		   
		   case "5" : processStar(sc); return true;
		   
		   case "6" : processifDiscounted(sc); return true;
		   
		   default : System.out.println("No such option!"); return true;
			
		}
		
	}

	private void printFilterInfo() {
		
		System.out.println("------------------------------------------------");


		System.out.println("Please enter the filter number:\n" + "1:brand\n" + "2:category\n" + "3:price\n"
				+ "4:capacity\n" + "5:star rating\n" + "6:if discounted\n" + "0:exit and show the results");
	}
	
	private void printAvailableBrands() {
		
		System.out.println("------------------------------------------------");

		
		System.out.println("Please select brands, when you select more than one brand, please separate them with commas(,):\n" + 
				"1: Daikin\n" + 
				"2: LG\n" + 
				"3: BlueStar\n" 
			);
		
	}
	
	private void processBrands(Scanner sc) throws Exception {
		
		printAvailableBrands();
		
		String input = sc.nextLine();
		
		String[] brandCodeList = input.trim().split(",");
		
		List<String> brands = new ArrayList<>();
		
		for(String code : brandCodeList) {
			
			switch(code.trim()) {
			
			   case "1": brands.add("Daikin");break;
			   
			   case "2": brands.add("LG");break;
			   
			   case "3": brands.add("BlueStar");break;
			   	   
			   default: throw new Exception("Illegal brand name!");
			
			}
			
		}
		
		filter.setBrands(brands);

	}
	
	private void printAvailableCategory() {
		
		System.out.println("------------------------------------------------");

		
		System.out.println("please select one category:\n" + 
				"1:Inverter AC\n" + 
				"2:Window AC\n" + 
				"3:Portable AC");
		
	}
	
	private void processCategory(Scanner sc) throws Exception {
		
		printAvailableCategory();
		
		String input = sc.nextLine();
		
		switch(input.trim()) {
		   
		   case "1" : filter.setCategoryName("Inverter AC");break;
		   
		   case "2" : filter.setCategoryName("Window AC");break;
		   
		   case "3" : filter.setCategoryName("Portable AC");break;
		   
		   default : throw new Exception("Illegal brand name!");
		
		}
		
	}
	
	private void processPrice(Scanner sc) throws Exception{
		
		
		System.out.println("------------------------------------------------");

		
		System.out.println("Please specify the maximum price:");
		
		String input = sc.nextLine().trim();
		
	
	    if(Double.parseDouble(input) < 0)
	    	throw new Exception("Illegal price!");
			

	    filter.setPriceRange(input);
		
	}
	
    private void processCapacity(Scanner sc) throws Exception{
    	
		System.out.println("------------------------------------------------");

		
		System.out.println("Please specify the minimum capacity:");
		
		String input = sc.nextLine().trim();
		
	
	    if(Double.parseDouble(input) < 0)
	    	throw new Exception("Illegal capacity!");
			
	    filter.setMinimunCapacity(input);
		
	}
    
    private void processStar(Scanner sc) throws Exception{
    	
    	
		System.out.println("------------------------------------------------");

		
		System.out.println("Please specify the minimum star rating:");
		
		String input = sc.nextLine().trim();
		
	    if(Double.parseDouble(input) < 0)
	    	throw new Exception("Illegal star rating!");
			
	    filter.setMinimumStar(input);
		
	}
    
    private void processifDiscounted(Scanner sc) throws Exception{
    	
		System.out.println("------------------------------------------------");

		
		System.out.println("Are you looking for any discount? YES or NO? ");
		
		String input = sc.nextLine().trim();
		
	    if(input.equalsIgnoreCase("yes"))
	    	filter.setIfDiscount("true");
	    else if(input.equalsIgnoreCase("no"))
	    	filter.setIfDiscount("false");
	    else
	    	throw new Exception("You should input yes or no!!!");
		
	}

}
