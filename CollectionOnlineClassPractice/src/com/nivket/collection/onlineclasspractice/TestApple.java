package com.nivket.collection.onlineclasspractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TestApple {

	public static void main(String[] args) {

		List<Apple> apples = new ArrayList<Apple>();

		apples.add(new Apple(80, "green" ));
		apples.add(new Apple(125, "green"));
		apples.add(new Apple(120, "red"));
		apples.add(new Apple(160, "red"));

//		apples.sort(comparing(Apple::getWeight).reversed());
		/*
		 * Collections.sort(apples); for (Apple app : apples) {
		 * 
		 * System.out.println(app.getColor() + ".. "+ app.getWeight()); }
		 * 
		 * Collections.sort(apples, new NameComparator()); System.out.println(apples);
		 */
		// 
		
		
		
		Apple a1 = new Apple(60,"a");
		Apple a2 = new Apple(70,"b");
		
		a1.compareTo(a2);
		
		Comparator<Apple> c = (b1,b2) -> b1.getWeight().compareTo(b2.getWeight());
		
		Comparator<Apple> c2 = (b1,b2) -> b1.getColor().compareTo(b2.getColor());
	
		Collections.sort(apples);
		
		Collections.sort(apples,c2);
		
		
		
		
		

		/*
		 * for (Apple app : apples) {
		 * 
		 * if (app.getWeight() > 150) {
		 * 
		 * apples.add(app);
		 * 
		 * System.out.println(app.getColor() + app.getWeight()); }
		 * 
		 * }
		 */
		
		

		/*
		 * //Predicate<Apple> redApple =(Apple a)->{ return
		 * a.getColor().equals("red");}; //Predicate<Apple> redAndHeavyApple =
		 * redApple.and(a->a.getWeight()>150); //List<Apple> applesList
		 * =apples.stream().filter(redAndHeavyApple).collect(Collectors.toList());
		 * 
		 * 
		 * for(Apple apple : applesList) {
		 * 
		 * 
		 * System.out.println(apple); }
		 */

//		List<String> app1 = apples.stream()
//              .filter((apples)->apples.getWeight>150)
//             .map( dish -> dish.getName() )
//             .collect(Collectors.toList());		for(String dish: app1) {

//		Collections.sort(apples);
//		
//		System.out.println(apples);
//
		/*
		 * for (Apple app : apples) {
		 * 
		 * System.out.println(app.getColor() + app.getWeight());
		 * 
		 * // }
		 * 
		 * }
		 */
	}

}