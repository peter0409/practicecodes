package com.nivtek.hibernateapp.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "category")
public class Category implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "category_name")
	private String categoryName;

	@OneToMany(mappedBy = "superCategory")
	private Set<Category> subCategory;

	@ManyToOne
	@JoinColumn(name="superCategory_id")
	private Category superCategory;

	@Column(name = "create_date")
	@Temporal(TemporalType.DATE)
	private Date createDate;

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
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}

	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	/**
	 * @return the subCategory
	 */
	public Set<Category> getSubCategory() {
		return subCategory;
	}

	/**
	 * @param subCategory the subCategory to set
	 */
	public void setSubCategory(Set<Category> subCategory) {
		this.subCategory = subCategory;
	}

	/**
	 * @return the superCategory
	 */
	public Category getSuperCategory() {
		return superCategory;
	}

	/**
	 * @param superCategory the superCategory to set
	 */
	public void setSuperCategory(Category superCategory) {
		this.superCategory = superCategory;
	}

	/**
	 * @return the createDate
	 */
	public Date getCreateDate() {
		return createDate;
	}

	/**
	 * @param createDate the createDate to set
	 */
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", categoryName=" + categoryName + ", createDate=" + createDate + "]";
	}

	/**
	 * @param id
	 * @param categoryName
	 * @param createDate
	 */
	public Category(int id, String categoryName, Date createDate) {
		super();
		this.id = id;
		this.categoryName = categoryName;
		this.createDate = createDate;
	}

	/**
	 * 
	 */
	public Category() {
		super();
	}

}
