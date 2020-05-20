package com.nivtek.hibernate.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="items")
public class Item {
	
	@Id
	@Column(name="item_id")
	private long itemId;
	
	@Column(name="item_name")
	private String itemName;
	
	@Column(name="create_date")
	@Temporal(TemporalType.DATE)
	private Date createDate;
	
	@Column(name="initial_price")
	private BigDecimal initialPrice;
	
	@Column(name="bid_end_date")
	@Temporal(TemporalType.DATE)
	private Date bidEndDate;
	
	@Column(name="bid_start_date")
	@Temporal(TemporalType.DATE)
	private Date bidStartDate;
	
	@OneToMany(mappedBy ="item")
	private Set<Bid> bids =new HashSet<Bid>();
	
	
	@ManyToMany
	@JoinTable(name="items_categories",joinColumns = @JoinColumn(name="item_id"),inverseJoinColumns = @JoinColumn(name="category_id"))
	private Set<Category> categories = new HashSet<>();

	/**
	 * @return the itemId
	 */
	public long getItemId() {
		return itemId;
	}

	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	/**
	 * @return the itemName
	 */
	public String getItemName() {
		return itemName;
	}

	/**
	 * @param itemName the itemName to set
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
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

	/**
	 * @return the initialPrice
	 */
	public BigDecimal getInitialPrice() {
		return initialPrice;
	}

	/**
	 * @param initialPrice the initialPrice to set
	 */
	public void setInitialPrice(BigDecimal initialPrice) {
		this.initialPrice = initialPrice;
	}

	/**
	 * @return the bidEndDate
	 */
	public Date getBidEndDate() {
		return bidEndDate;
	}

	/**
	 * @param bidEndDate the bidEndDate to set
	 */
	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	/**
	 * @return the bidStartDate
	 */
	public Date getBidStartDate() {
		return bidStartDate;
	}

	/**
	 * @param bidStartDate the bidStartDate to set
	 */
	public void setBidStartDate(Date bidStartDate) {
		this.bidStartDate = bidStartDate;
	}

	/**
	 * @return the bids
	 */
	public Set<Bid> getBids() {
		return bids;
	}

	/**
	 * @param bids the bids to set
	 */
	public void setBids(Set<Bid> bids) {
		this.bids = bids;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidEndDate == null) ? 0 : bidEndDate.hashCode());
		result = prime * result + ((bidStartDate == null) ? 0 : bidStartDate.hashCode());
		result = prime * result + ((createDate == null) ? 0 : createDate.hashCode());
		result = prime * result + ((initialPrice == null) ? 0 : initialPrice.hashCode());
		result = prime * result + (int) (itemId ^ (itemId >>> 32));
		result = prime * result + ((itemName == null) ? 0 : itemName.hashCode());
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
		Item other = (Item) obj;
		if (bidEndDate == null) {
			if (other.bidEndDate != null)
				return false;
		} else if (!bidEndDate.equals(other.bidEndDate))
			return false;
		if (bidStartDate == null) {
			if (other.bidStartDate != null)
				return false;
		} else if (!bidStartDate.equals(other.bidStartDate))
			return false;
		if (createDate == null) {
			if (other.createDate != null)
				return false;
		} else if (!createDate.equals(other.createDate))
			return false;
		if (initialPrice == null) {
			if (other.initialPrice != null)
				return false;
		} else if (!initialPrice.equals(other.initialPrice))
			return false;
		if (itemId != other.itemId)
			return false;
		if (itemName == null) {
			if (other.itemName != null)
				return false;
		} else if (!itemName.equals(other.itemName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", createDate=" + createDate + ", initialPrice="
				+ initialPrice + ", bidEndDate=" + bidEndDate + ", bidStartDate=" + bidStartDate + "]";
	}

	/**
	 * @param itemId
	 * @param itemName
	 * @param createDate
	 * @param initialPrice
	 * @param bidEndDate
	 * @param bidStartDate
	 * @param bids
	 */
	public Item(long itemId, String itemName, Date createDate, BigDecimal initialPrice, Date bidEndDate,
			Date bidStartDate, Set<Bid> bids) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.createDate = createDate;
		this.initialPrice = initialPrice;
		this.bidEndDate = bidEndDate;
		this.bidStartDate = bidStartDate;
		this.bids = bids;
	}

	/**
	 * 
	 */
	public Item() {
		super();
	}

	
}
