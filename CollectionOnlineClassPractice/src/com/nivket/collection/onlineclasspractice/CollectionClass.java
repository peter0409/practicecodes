package com.nivket.collection.onlineclasspractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionClass {
	private int id;
	private String name;
	private double Price;

	public CollectionClass(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.Price = price;

	}

	public static void main(String[] args) {
		CollectionClass coll = new CollectionClass(101, "iphone", 500);
		CollectionClass coll1 = new CollectionClass(101, "iphone", 500);

//		List<CollectionClass> tempList = new ArrayList<CollectionClass>();
//		
//		tempList.add(coll);
//		tempList.add(coll1);
//		
//		Iterator itr=tempList.iterator();  
//		
//		  while(itr.hasNext()){  
//		     CollectionClass clas = (CollectionClass)itr.next();
//		     System.out.println(clas.name + " " + clas.id);
//		  }  

		System.out.println(coll.hashCode() + "   " + coll1.hashCode());
		
		System.out.println(coll.equals(coll1));
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(Price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CollectionClass other = (CollectionClass) obj;
		if (Double.doubleToLongBits(Price) != Double.doubleToLongBits(other.Price))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
}