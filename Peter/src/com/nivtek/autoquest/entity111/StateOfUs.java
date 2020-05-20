package com.nivtek.autoquest.entity111;

public class StateOfUs {

	private int state_id;
	private char state_code;
	private String state_name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + state_code;
		result = prime * result + state_id;
		result = prime * result + ((state_name == null) ? 0 : state_name.hashCode());
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
		StateOfUs other = (StateOfUs) obj;
		if (state_code != other.state_code)
			return false;
		if (state_id != other.state_id)
			return false;
		if (state_name == null) {
			if (other.state_name != null)
				return false;
		} else if (!state_name.equals(other.state_name))
			return false;
		return true;
	}

	/**
	 * @return the state_id
	 */
	public int getState_id() {
		return state_id;
	}

	/**
	 * @param state_id the state_id to set
	 */
	public void setState_id(int state_id) {
		this.state_id = state_id;
	}

	/**
	 * @return the state_code
	 */
	public char getState_code() {
		return state_code;
	}

	/**
	 * @param state_code the state_code to set
	 */
	public void setState_code(char state_code) {
		this.state_code = state_code;
	}

	/**
	 * @return the state_name
	 */
	public String getState_name() {
		return state_name;
	}

	/**
	 * @param state_name the state_name to set
	 */
	public void setState_name(String state_name) {
		this.state_name = state_name;
	}

	@Override
	public String toString() {
		return "StateOfUs [state_id=" + state_id + ", state_code=" + state_code + ", state_name=" + state_name + "]";
	}

	/**
	 * @param state_id
	 * @param state_code
	 * @param state_name
	 */
	public StateOfUs(int state_id, char state_code, String state_name) {
		super();
		this.state_id = state_id;
		this.state_code = state_code;
		this.state_name = state_name;
	}

	/**
	 * 
	 */
	public StateOfUs() {
		super();
	}

}
