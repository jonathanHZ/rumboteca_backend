package co.com.udem.rumboteca.model;

import java.io.Serializable;

public class StateDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6536344887556472010L;

	private int id;

	private int countryId;

	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
