package co.com.udem.rumboteca.persistence.entity;

/**
 * This class manage event's persistence
 * 
 * @author Milton
 */
public class Event {

	/** Identifier */
	private int id;

	/** Photo's path */
	private String photo;

	/** Title to show */
	private String tittle;

	/** Description to show */
	private String description;

	/** Contact identifier */
	private int contactId;

	private int placeId;

	private String fecha;

	private String completDescription;

	public String getCompletDescription() {
		return completDescription;
	}

	public void setCompletDescription(String completDescription) {
		this.completDescription = completDescription;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
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

	/**
	 * @return the contactId
	 */
	public int getContactId() {
		return contactId;
	}

	/**
	 * @param contactId
	 *            the contactId to set
	 */
	public void setContactId(int contactId) {
		this.contactId = contactId;
	}
}
