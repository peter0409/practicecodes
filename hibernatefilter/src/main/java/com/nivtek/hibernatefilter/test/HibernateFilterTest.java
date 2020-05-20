package com.nivtek.hibernatefilter.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.nivtek.hibernatefilter.entity.AirConditioner;
import com.nivtek.hibernatefilter.service.ACCriteriaService;
import com.nivtek.hibernatefilter.service.AirConditionerService;

/**
 * @author Bootcamp User 007
 *
 */
public class HibernateFilterTest {

	private ACCriteriaService filter;

	private static AirConditionerService service = new AirConditionerService();

	public static void main(String args[]) throws Exception {

		Scanner scanner = new Scanner(System.in);

		HibernateFilterTest tf = new HibernateFilterTest();

		while (true) {

			tf.printFilterInfo();

			if (!tf.processFilterOptions(scanner)) {
				break;
			}

		}

		tf.printResults(service.getAirConditioners(tf.filter));

		scanner.close();

	}

	private void printFilterInfo() {

		System.out.println("------------------------------------------------");

		System.out.println("Please enter the filter number:\n" + "1:brand\n" + "2:category\n" + "3:price\n"
				+ "4:capacity\n" + "5:star rating\n" + "6:if discounted\n" + "0:exit and show the results");
	}

	private void printAvailableBrands() {

		System.out.println("------------------------------------------------");

		System.out.println("Please select brands\n" + "1: Daikin\n" + "2: LG\n" + "3: BlueStar\n");

	}

	private void printResults(List<AirConditioner> resultList) {

		resultList.forEach(System.out::println);

	}

	private boolean processFilterOptions(Scanner scanner) throws Exception {

		String input = scanner.nextLine();

		switch (input.trim()) {

		case "0":
			return false;

		case "1":
			processBrands(scanner);
			return true;

		case "2":
			processCategory(scanner);
			return true;

		case "3":
			processPrice(scanner);
			return true;

		case "4":
			processCapacity(scanner);
			return true;

		case "5":
			processStar(scanner);
			return true;

		case "6":
			processifDiscounted(scanner);
			return true;

		default:
			System.out.println("No such options!");
			return true;

		}

	}

	private void processBrands(Scanner scanner) throws Exception {

		printAvailableBrands();

		String input = scanner.nextLine();

		String[] brandCodeList = input.trim().split(",");

		List<String> brands = new ArrayList<>();

		for (String code : brandCodeList) {

			switch (code.trim()) {

			case "1":
				brands.add("Daikin");
				break;

			case "2":
				brands.add("LG");
				break;

			case "3":
				brands.add("BlueStar");
				break;

			default:
				throw new Exception("Invaild brands name!");

			}

		}

		filter.setBrands(brands);

	}

	private void printAvailableCategory() {

		System.out.println("------------------------------------------------");

		System.out.println("please select one category:\n" + "1:Inverter AC\n" + "2:Window AC\n" + "3:Portable AC");

	}

	private void processCategory(Scanner scanner) throws Exception {

		printAvailableCategory();

		String input = scanner.nextLine();

		switch (input) {

		case "1":
			filter.setCategoryName("Inverter AC");
			break;

		case "2":
			filter.setCategoryName("Window AC");
			break;

		case "3":
			filter.setCategoryName("Portable AC");
			break;

		default:
			throw new Exception("Illegal brand name!");

		}

	}

	private void processPrice(Scanner scanner) throws Exception {

		System.out.println("------------------------------------------------");

		System.out.println("Please specify the maximum price:");

		String input = scanner.nextLine();

		filter.setPriceRange(input);

	}

	private void processCapacity(Scanner scanner) throws Exception {

		System.out.println("------------------------------------------------");

		System.out.println("Please specify the minimum capacity:");

		String input = scanner.nextLine();

		filter.setMinimumCapacity(input);

	}

	private void processStar(Scanner scanner) throws Exception {

		System.out.println("------------------------------------------------");

		System.out.println("Please specify the minimum star rating:");

		String input = scanner.nextLine();

		filter.setMinimumStar(input);

	}

	private void processifDiscounted(Scanner scanner) throws Exception {

		System.out.println("------------------------------------------------");

		System.out.println("Are you looking for any discount? YES or NO? ");

		String input = scanner.nextLine();

		if (input.equalsIgnoreCase("yes"))
			filter.setIfDiscount("true");
		else if (input.equalsIgnoreCase("no"))
			filter.setIfDiscount("false");
		else
			throw new Exception("You should input yes or no!!!");

	}

}
