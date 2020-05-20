package com.nivket.chapter2datatypes;

public class DishEntity implements Comparable<DishEntity>{

	private String name;
	private boolean vegetarian;
	private Integer calories;
	private DishType dishtype;
	
	

	public DishEntity(String name, boolean vegetarian, int calories, DishType dishtype) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.dishtype = dishtype;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the vegetarian
	 */
	public boolean isVegetarian() {
		return vegetarian;
	}

	/**
	 * @param vegetarian the vegetarian to set
	 */
	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "DishEntity [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", dishtype="
				+ dishtype + "]";
	}

	/**
	 * @return the calories
	 */
	
	/**
	 * @return the calories
	 */
	public Integer getCalories() {
		return calories;
	}

	/**
	 * @param calories the calories to set
	 */
	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	/**
	 * @return the dishtype
	 */
	public DishType getDishtype() {
		return dishtype;
	}

	/**
	 * @param dishtype the dishtype to set
	 */
	public void setDishtype(DishType dishtype) {
		this.dishtype = dishtype;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + calories;
		result = prime * result + ((dishtype == null) ? 0 : dishtype.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (vegetarian ? 1231 : 1237);
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
		DishEntity other = (DishEntity) obj;
		if (calories != other.calories)
			return false;
		if (dishtype == null) {
			if (other.dishtype != null)
				return false;
		} else if (!dishtype.equals(other.dishtype))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (vegetarian != other.vegetarian)
			return false;
		return true;
	}

	
	@Override
	public int compareTo(DishEntity o) {
		return this.calories.compareTo(o.calories);
	}

}
