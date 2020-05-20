package com.nivket.collection.onlineclasspractice;

public class Apple implements Comparable<Apple>{
	
	
	private Integer weight;
	private String color;
	/**
	 * @return the weight
	 */
	
	public Integer getWeight() {
		return weight;
	}
	/**
	 * 
	 */
	public Apple() {
	}
	/**
	 * @param weight
	 * @param color
	 */
	public Apple(Integer weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + weight;
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
		Apple other = (Apple) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (weight != other.weight)
			return false;
		return true;
	}
	@Override
	public int compareTo(Apple o) {
		
		return this.weight.compareTo(o.weight);
	}

}
