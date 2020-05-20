package com.nivtek.springapp.vo;

public class Order {

	private int id;
	private int productId;
	private int oderedQuantity;
	private String comments;

	@Override
	public String toString() {
		return "Order [id=" + id + ", productId=" + productId + ", oderedQuantity=" + oderedQuantity + ", comments="
				+ comments + "]";
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the productId
	 */
	public int getProductId() {
		return productId;
	}

	/**
	 * @param productId the productId to set
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}

	/**
	 * @return the oderedQuantity
	 */
	public int getOderedQuantity() {
		return oderedQuantity;
	}

	/**
	 * @param oderedQuantity the oderedQuantity to set
	 */
	public void setOderedQuantity(int oderedQuantity) {
		this.oderedQuantity = oderedQuantity;
	}

	/**
	 * @return the comments
	 */
	public String getComments() {
		return comments;
	}

	/**
	 * @param comments the comments to set
	 */
	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comments == null) ? 0 : comments.hashCode());
		result = prime * result + id;
		result = prime * result + oderedQuantity;
		result = prime * result + productId;
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
		Order other = (Order) obj;
		if (comments == null) {
			if (other.comments != null)
				return false;
		} else if (!comments.equals(other.comments))
			return false;
		if (id != other.id)
			return false;
		if (oderedQuantity != other.oderedQuantity)
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}

	/**
	 * @param id
	 * @param productId
	 * @param oderedQuantity
	 * @param comments
	 */
	public Order(int id, int productId, int oderedQuantity, String comments) {
		super();
		this.id = id;
		this.productId = productId;
		this.oderedQuantity = oderedQuantity;
		this.comments = comments;
	}

	/**
	 * 
	 */
	public Order() {
		super();
	}

}
