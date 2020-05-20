package com.nivket.travelportal.service;

import com.nivket.travelportal.dao.VacationChoiceDao;
import com.nivket.travelportal.entity.CustomerInfo;

/**
 * @author Bootcamp User 007
 *
 */
public class VacationChoiceService {

	public void getVacationChoice(CustomerInfo customer) {

		// get age and occupation from customerinfo class
		int age = customer.getAge();
		String occupation = customer.getOccupation();

		// create object of class VacationChoiceDao
		VacationChoiceDao vacationChoiceDao = new VacationChoiceDao();

		// call different methods
		vacationChoiceDao.getVacationDetails();
		vacationChoiceDao.getVacationDetails1();

		// write logics
		if (age > 50 && occupation.equalsIgnoreCase("Teacher")) {
			System.out.println("Your vacation choice1 is below :");
			System.out.println("---------------");
			System.out.println(vacationChoiceDao.getVacationDetails().getLocation());
			System.out.println(vacationChoiceDao.getVacationDetails().getFlight());
			System.out.println(vacationChoiceDao.getVacationDetails().getHotel());

		} else if (age < 50) {
			System.out.println("Your vacation choice1 is below :");
			System.out.println("---------------");
			System.out.println((vacationChoiceDao.getVacationDetails1().getFlight()));
			System.out.println((vacationChoiceDao.getVacationDetails1().getHotel()));
			System.out.println((vacationChoiceDao.getVacationDetails1().getLocation()));

		} else
			System.out.println("Sorry,you are not qualified");

	}
}
