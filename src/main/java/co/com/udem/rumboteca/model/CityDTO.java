package co.com.udem.rumboteca.model;

import java.io.Serializable;

public class CityDTO implements Serializable {

	private static final long serialVersionUID = -8219838891605115525L;
	
	private int id;
	
	private int stateId;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
