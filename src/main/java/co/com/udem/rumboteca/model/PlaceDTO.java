package co.com.udem.rumboteca.model;

import java.io.Serializable;

import co.com.udem.rumboteca.persistence.entity.Contact;

/**
 * This class has places info
 * 
 * @author Milton
 */
public class PlaceDTO implements Serializable {

	/**
   * 
   */
	private static final long serialVersionUID = -4664505011117001682L;

	private int id;
	/** Photo's path. */
	private String photo;

	private String tittle;

	private String description;

	private String completDescription;

	private String direction;

	private Contact contact;

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public String getCompletDescription() {
		return completDescription;
	}

	public void setCompletDescription(String completDescription) {
		this.completDescription = completDescription;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the photo
	 */
	public String getPhoto() {
		return photo;
	}

	/**
	 * @param photo
	 *            the photo to set
	 */
	public void setPhoto(String photo) {
		this.photo = photo;
	}

	/**
	 * @return the tittle
	 */
	public String getTittle() {
		return tittle;
	}

	/**
	 * @param tittle
	 *            the tittle to set
	 */
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
}
