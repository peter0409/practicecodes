package com.nivket.travelportal.dao;

import com.nivket.travelportal.entity.VacationChoice;

/**
 * @author Bootcamp User 007
 *
 */
public class VacationChoiceDao {

//declare a method to list vacationdetail1
	public VacationChoice getVacationDetails() {

		// create object1 of class VacationChoice

		VacationChoice vacationChoice1 = new VacationChoice();

		// set vocation detail1
		vacationChoice1.setLocation("Paris");
		vacationChoice1.setFlight("Delta 8792F");
		vacationChoice1.setHotel("Sharaton");

		return vacationChoice1;
	}

	// declare a method to list vacationdetail2
	public VacationChoice getVacationDetails1() {

		// create object2 of class VacationChoice
		VacationChoice vacationChoice2 = new VacationChoice();

		// set vocation detail2
		vacationChoice2.setLocation("China");
		vacationChoice2.setFlight("AA 242D");
		vacationChoice2.setHotel("Helton");

		return vacationChoice2;

	}
}
