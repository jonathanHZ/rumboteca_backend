package co.com.udem.rumboteca.model;

import java.io.Serializable;

public class ReviewDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6952106611587058049L;

	/** Photo's path */
	private String photo;

	/** Title */
	private String tittle;

	/** Description */
	private String description;

	/** Identifier */
	private int id;

	/** Place identifier */
	private int placeId;

	/** Event identifier */
	private int eventId;

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public int getEventId() {
		return eventId;
	}

	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	

}
