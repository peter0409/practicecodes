package com.nivtek.springapp.dbstore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.nivtek.springapp.vo.Order;
import com.nivtek.springapp.vo.Product;

public interface MySQLDBStore {

	List<Product> PRODUCTS = Arrays.asList(new Product[] {

			new Product(101, "iphone", 500, "Mobil", 100),
			new Product(102, "A70", 350, "Mobile", 200),
			new Product(103, "OnePlus7", 400, "Mobile", 150), 
			new Product(104, "GalaxyNote10", 400, "Mobile", 210),

	});

	List<Order> ODERS = new ArrayList<Order>();
}
