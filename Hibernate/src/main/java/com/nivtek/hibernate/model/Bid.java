package com.nivtek.hibernate.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="bids")
public class Bid {

	@Id
	@Column(name="bid_id")
	private Long bidId;
	
	@Column(name="bid_price")
	private BigDecimal bidPrice;
	
	@Column(name="bid_date")
	@Temporal(TemporalType.DATE)
	private Date bidDate;
	
	@ManyToOne
	@JoinColumn(name="item_id")
	private Item item;

	/**
	 * @return the bidId
	 */
	public Long getBidId() {
		return bidId;
	}

	/**
	 * @param bidId the bidId to set
	 */
	public void setBidId(Long bidId) {
		this.bidId = bidId;
	}

	/**
	 * @return the bidPrice
	 */
	public BigDecimal getBidPrice() {
		return bidPrice;
	}

	/**
	 * @param bidPrice the bidPrice to set
	 */
	public void setBidPrice(BigDecimal bidPrice) {
		this.bidPrice = bidPrice;
	}

	/**
	 * @return the bidDate
	 */
	public Date getBidDate() {
		return bidDate;
	}

	/**
	 * @param bidDate the bidDate to set
	 */
	public void setBidDate(Date bidDate) {
		this.bidDate = bidDate;
	}

	@Override
	public String toString() {
		return "Bid [bidId=" + bidId + ", bidPrice=" + bidPrice + ", bidDate=" + bidDate + "]";
	}

	/**
	 * @param bidId
	 * @param bidPrice
	 * @param bidDate
	 */
	public Bid(Long bidId, BigDecimal bidPrice, Date bidDate) {
		super();
		this.bidId = bidId;
		this.bidPrice = bidPrice;
		this.bidDate = bidDate;
	}

	/**
	 * 
	 */
	public Bid() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bidDate == null) ? 0 : bidDate.hashCode());
		result = prime * result + ((bidId == null) ? 0 : bidId.hashCode());
		result = prime * result + ((bidPrice == null) ? 0 : bidPrice.hashCode());
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
		Bid other = (Bid) obj;
		if (bidDate == null) {
			if (other.bidDate != null)
				return false;
		} else if (!bidDate.equals(other.bidDate))
			return false;
		if (bidId == null) {
			if (other.bidId != null)
				return false;
		} else if (!bidId.equals(other.bidId))
			return false;
		if (bidPrice == null) {
			if (other.bidPrice != null)
				return false;
		} else if (!bidPrice.equals(other.bidPrice))
			return false;
		return true;
	}
	
	
	
}
