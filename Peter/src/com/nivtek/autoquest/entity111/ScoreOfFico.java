package com.nivtek.autoquest.entity111;

public class ScoreOfFico {

	private int id_fico_score;
	private String ssn;
	private String experian;
	private String transunion;
	private String equifax;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((equifax == null) ? 0 : equifax.hashCode());
		result = prime * result + ((experian == null) ? 0 : experian.hashCode());
		result = prime * result + id_fico_score;
		result = prime * result + ((ssn == null) ? 0 : ssn.hashCode());
		result = prime * result + ((transunion == null) ? 0 : transunion.hashCode());
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
		ScoreOfFico other = (ScoreOfFico) obj;
		if (equifax == null) {
			if (other.equifax != null)
				return false;
		} else if (!equifax.equals(other.equifax))
			return false;
		if (experian == null) {
			if (other.experian != null)
				return false;
		} else if (!experian.equals(other.experian))
			return false;
		if (id_fico_score != other.id_fico_score)
			return false;
		if (ssn == null) {
			if (other.ssn != null)
				return false;
		} else if (!ssn.equals(other.ssn))
			return false;
		if (transunion == null) {
			if (other.transunion != null)
				return false;
		} else if (!transunion.equals(other.transunion))
			return false;
		return true;
	}

	/**
	 * @return the id_fico_score
	 */
	public int getId_fico_score() {
		return id_fico_score;
	}

	/**
	 * @param id_fico_score the id_fico_score to set
	 */
	public void setId_fico_score(int id_fico_score) {
		this.id_fico_score = id_fico_score;
	}

	/**
	 * @return the ssn
	 */
	public String getSsn() {
		return ssn;
	}

	/**
	 * @param ssn the ssn to set
	 */
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	/**
	 * @return the experian
	 */
	public String getExperian() {
		return experian;
	}

	/**
	 * @param experian the experian to set
	 */
	public void setExperian(String experian) {
		this.experian = experian;
	}

	/**
	 * @return the transunion
	 */
	public String getTransunion() {
		return transunion;
	}

	/**
	 * @param transunion the transunion to set
	 */
	public void setTransunion(String transunion) {
		this.transunion = transunion;
	}

	/**
	 * @return the equifax
	 */
	public String getEquifax() {
		return equifax;
	}

	/**
	 * @param equifax the equifax to set
	 */
	public void setEquifax(String equifax) {
		this.equifax = equifax;
	}

	@Override
	public String toString() {
		return "ScoreOfFico [id_fico_score=" + id_fico_score + ", ssn=" + ssn + ", experian=" + experian
				+ ", transunion=" + transunion + ", equifax=" + equifax + "]";
	}

	/**
	 * @param id_fico_score
	 * @param ssn
	 * @param experian
	 * @param transunion
	 * @param equifax
	 */
	public ScoreOfFico(int id_fico_score, String ssn, String experian, String transunion, String equifax) {
		super();
		this.id_fico_score = id_fico_score;
		this.ssn = ssn;
		this.experian = experian;
		this.transunion = transunion;
		this.equifax = equifax;
	}

	/**
	 * 
	 */
	public ScoreOfFico() {
		super();
	}

}
