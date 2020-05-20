package com.nivtek.springapp.dao;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class MessageDAO {

	private List<String> messageList = Arrays
			.asList(new String[] {"Good moring!","Good Eveing!","Good Afternoon","How Are You?"});
	private Random random = new Random();

	public MessageDAO() {

	}

	public String fetchMessage() {

		return messageList.get(random.nextInt(3));
	}
}
