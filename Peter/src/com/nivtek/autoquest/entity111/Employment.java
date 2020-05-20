package com.nivtek.autoquest.entity111;

public class Employment {

	private int employment_id;
	private String status;
	private String employer;
	private String jobTitle;
	private String time;
	private double annualIncome;

	/**
	 * 
	 */
	public Employment() {
		super();
	}

	/**
	 * @param employment_id
	 * @param status
	 * @param employer
	 * @param jobTitle
	 * @param time
	 * @param annualIncome
	 */
	public Employment(int employment_id, String status, String employer, String jobTitle, String time,
			double annualIncome) {
		super();
		this.employment_id = employment_id;
		this.status = status;
		this.employer = employer;
		this.jobTitle = jobTitle;
		this.time = time;
		this.annualIncome = annualIncome;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(annualIncome);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((employer == null) ? 0 : employer.hashCode());
		result = prime * result + employment_id;
		result = prime * result + ((jobTitle == null) ? 0 : jobTitle.hashCode());
		result = prime * result + ((status == null) ? 0 : status.hashCode());
		result = prime * result + ((time == null) ? 0 : time.hashCode());
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
		Employment other = (Employment) obj;
		if (Double.doubleToLongBits(annualIncome) != Double.doubleToLongBits(other.annualIncome))
			return false;
		if (employer == null) {
			if (other.employer != null)
				return false;
		} else if (!employer.equals(other.employer))
			return false;
		if (employment_id != other.employment_id)
			return false;
		if (jobTitle == null) {
			if (other.jobTitle != null)
				return false;
		} else if (!jobTitle.equals(other.jobTitle))
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employment [employment_id=" + employment_id + ", status=" + status + ", employer=" + employer
				+ ", jobTitle=" + jobTitle + ", time=" + time + ", annualIncome=" + annualIncome + "]";
	}

	/**
	 * @return the employment_id
	 */
	public int getEmployment_id() {
		return employment_id;
	}

	/**
	 * @param employment_id the employment_id to set
	 */
	public void setEmployment_id(int employment_id) {
		this.employment_id = employment_id;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the employer
	 */
	public String getEmployer() {
		return employer;
	}

	/**
	 * @param employer the employer to set
	 */
	public void setEmployer(String employer) {
		this.employer = employer;
	}

	/**
	 * @return the jobTitle
	 */
	public String getJobTitle() {
		return jobTitle;
	}

	/**
	 * @param jobTitle the jobTitle to set
	 */
	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the annualIncome
	 */
	public double getAnnualIncome() {
		return annualIncome;
	}

	/**
	 * @param annualIncome the annualIncome to set
	 */
	public void setAnnualIncome(double annualIncome) {
		this.annualIncome = annualIncome;
	}

}
