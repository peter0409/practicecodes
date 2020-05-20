package com.nivket.chapter2datatypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import com.nivket.collection.onlineclasspractice.Apple;
import com.nivket.collection.onlineclasspractice.Prediate;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class DishDetails {

	public static void main(String[] args) {

		DishEntity name1 = new DishEntity("Pork Fry", false, 800, DishType.MEAT);
		DishEntity name2 = new DishEntity("Pepper Chicken", false, 700, DishType.MEAT);
		DishEntity name3 = new DishEntity("BBQ", false, 600, DishType.OTHERS);
		DishEntity name4 = new DishEntity("FRIES", true, 500, DishType.MEAT);
		DishEntity name5 = new DishEntity("CHEEZE", false, 400, DishType.FISH);
		DishEntity name6 = new DishEntity("FRUIT", true, 120, DishType.MEAT);
		DishEntity name7 = new DishEntity("SALON", false, 500, DishType.FISH);
		DishEntity name8 = new DishEntity("PRAME", false, 300, DishType.MEAT);
		DishEntity name9 = new DishEntity("RICE", false, 200, DishType.MEAT);
		DishEntity name10 = new DishEntity("MILK", false, 150, DishType.MEAT);

		ArrayList<DishEntity> al = new ArrayList<>();

		al.add(name1);
		al.add(name2);
		al.add(name3);
		al.add(name4);
		al.add(name5);
		al.add(name6);
		al.add(name7);
		al.add(name8);
		al.add(name9);
		al.add(name10);
		
		
		Predicate<DishEntity> vegPred = (DishEntity d) -> {  return d.isVegetarian() == true;}; 
		Predicate<DishEntity> vegPredCalorie = vegPred.and(d ->d.getCalories() > 200);
		List<DishEntity> vegCalorieList = dishList.stream().filter(vegPredCalorie).collect(Collectors.toList());
		System.out.println("Using Predicate: " + vegCalorieList);
		
		List<String> vegetarianDishNames = al.stream()
            .filter( d -> d.isVegetarian() )
            .map( dish -> dish.getName() )
           .collect(Collectors.toList());
		
		Collections.sort(al);
		
		for(DishEntity de : al) {
			
			System.out.println(de.getName() + de.getCalories() + de.getDishtype());
			
		}
		
//		public int compareTo(Object o2) {
//			
//			int result = this.getId().compareTo(o2.getId());
//			
//			return result;
			
		}
//	Predicate<DishEntity> vegeterian = (DishEntity d) -> { return d.isVegetarian();};
//	Predicate<DishEntity> highCalorieVegDish = vegeterian.and(d -> d.getCalories() > 200);
//	List<DishEntity> filteredVegDish = dishDetails.stream().filter(highCalorieVegDish).collect(Collectors.toList());
//	for(DishEntity d: filteredVegDish) {
//		System.out.println(d.getName() + " " + d.getCalories());
//	}
//	
//	Predicate<DishEntity> vegPred = (DishEntity d) -> {  return d.isVegetarian() == true;}; 
//	Predicate<DishEntity> vegPredCalorie = vegPred.and(d ->d.getCalories() > 200);
//	List<DishEntity> vegCalorieList = dishList.stream().filter(vegPredCalorie).collect(Collectors.toList());
//	System.out.println("Using Predicate: " + vegCalorieList);
//		
//		List<String> vegetarianDishNames = al.stream()
//                .filter( d -> d.isVegetarian() )
//                .map( dish -> dish.getName() )
//                .collect(Collectors.toList());
////		for(String dish: vegetarianDishNames) {
//		
//		
//		
//		
//			System.out.println(vegetarianDishNames);
//
////			System.out.println(vegetarianDishNames);

//		List<Integer> calories = Arrays.asList(800, 700, 600, 500, 400, 120, 500, 300, 200, 150);
//
//		Collections.sort(calories);
//
//	System.out.println(calories);
//
//		ArrayList<DishEntity> veg = getVegetarian(al);
//		for(DishEntity de:veg) {
//			System.out.println(de.getName()+" "+de.getCalories());
//		}
//		
//		
//		Collections.sort(al,(DishEntity d1 , DishEntity d2 ) -> { return d1.getCalories().compareTo(d2.getCalories());});
//		
//		for(DishEntity d: al) {
//			
//			System.out.println(d.getCalories());
//		}
//
//	//public static ArrayList<DishEntity> getSortedVegetarian(ArrayList<DishEntity> al) {
////
////		ArrayList<DishEntity> veg2 = new ArrayList<DishEntity>();
//
//		Collections.sort(al, new Comparator<DishEntity>() {
////
//			@Override
//			public int compare(DishEntity o1, DishEntity o2) {
//
//				return o1.getName().compareTo(o2.getName());
//
//			}
//		});
//
////		for (DishEntity de2 : al) {
//
//			veg2.add(de2);
//
//		}
//		return dishdetails;

//	}

	public static ArrayList<DishEntity> getVegetarian(ArrayList<DishEntity> dishentity) {

		ArrayList<DishEntity> veg = new ArrayList<DishEntity>();

		for (DishEntity de : dishentity) {
			if (de.isVegetarian()) {
				veg.add(de);

			}
		}

		return veg;

	}

	public static ArrayList<DishEntity> getDishList(ArrayList<DishEntity> dishlist) {

		ArrayList<DishEntity> veg = new ArrayList<DishEntity>();

		for (DishEntity dish : dishlist) {
			if ((dish.getName().charAt(0) == 'P') && (dish.getCalories() > 250)) {

				veg.add(dish);

			}

		}
		return veg;

	}

	public static ArrayList<DishEntity> getDishList1(ArrayList<DishEntity> dishlist) {

		ArrayList<DishEntity> veg = new ArrayList<DishEntity>();

		for (DishEntity dish : dishlist) {
			if (dish.getCalories() > 300) {

				veg.add(dish);

			}

		}
		return veg;

	}
	public static ArrayList<DishEntity> getDishList2(ArrayList<DishEntity> dishlist) {

		ArrayList<DishEntity> veg = new ArrayList<DishEntity>();

		Iterator<DishEntity> itr = veg.iterator();
		while(itr.hasNext()){
			if ((((DishEntity) itr).getName().charAt(0) == 'P') && (((DishEntity) itr).getCalories() > 300)) {

				veg.add((DishEntity) itr);

			}

		}
		return veg;

	}

}