package com.nivtek.quoteinfo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuoteinfoApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(QuoteinfoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Started Consumer application");		
	}

}
