package com.nivtek.room3145.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.nivtek.room3145.entity.People;

/**
 * @author AsimSubedi
 *
 */

@Service
public class PeopleService {

	ArrayList<People> people = new ArrayList<People>();
	String name = null;

	public ArrayList<People> getPeople() {
		People sam = new People(1, "Sam", "Guru", "Nigeria");
		People asish = new People(2, "asish", "bro", "Nepal");
		People peter = new People(3, "peter", "bhai", "China");
		People sartha = new People(4, "sarthak", "buddy", "Nepal");
		People asim = new People(5, "asim", "subedi", "Nepal");
		people.add(sam);
		people.add(asish);
		people.add(peter);
		people.add(sartha);
		people.add(asim);
		return people;
	}

	public String getPeopleName(int id) {
		for (People x : people) {
			if (id == x.getId()) {
				name = x.getFirstName();
				break;
			} else {
				name = "Name not found";
			}
		}
		return name;
	}
}