package com.nivtek.corejava.datatypes.string.lab2;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Bootcamp User 007
 *
 */
public class BirthdayFormat {

	public static void main(String[] args) {

		Date today = new Date();
		
		SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yy");
		
		String date = DATE_FORMAT.format(today);
		System.out.println("Today in dd/MM/yy pattern : " + date);

		String[] words = date.split("/", 3);
		//print date
		for (String w : words) {
			System.out.println(w);
		}

	}
}