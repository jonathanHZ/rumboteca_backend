package co.com.udem.rumboteca.model;

import java.io.Serializable;
import java.util.List;

/**
 * This class has event info data model
 * 
 * @author Milton
 */
public class EventDTO implements Serializable {

	/** Serial ID */
	private static final long serialVersionUID = -3988140797906857960L;

	/** Identifier */
	private String id;

	/** Photo's path. */
	private String photo;

	/** Title to show. */
	private String tittle;

	/** Event description. */
	private String description;

	/** Event detail (each line is a paragraph) */
	private List<String> details;

	private String placeTittle;

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

	public String getPlaceTittle() {
		return placeTittle;
	}

	public void setPlaceTittle(String placeTittle) {
		this.placeTittle = placeTittle;
	}

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(String id) {
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
	 * @return the details
	 */
	public List<String> getDetails() {
		return details;
	}

	/**
	 * @param details
	 *            the details to set
	 */
	public void setDetails(List<String> details) {
		this.details = details;
	}
}
