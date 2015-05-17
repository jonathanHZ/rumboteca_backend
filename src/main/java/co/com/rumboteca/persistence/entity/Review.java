package co.com.rumboteca.persistence.entity;

/**
 * This class manage review persistence
 * @author Milton
 */
public class Review {

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

  /**
   * @return the photo
   */
  public String getPhoto() {
    return photo;
  }

  /**
   * @param photo the photo to set
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
   * @param tittle the tittle to set
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
   * @param description the description to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * @return the id
   */
  public int getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(int id) {
    this.id = id;
  }

  /**
   * @return the placeId
   */
  public int getPlaceId() {
    return placeId;
  }

  /**
   * @param placeId the placeId to set
   */
  public void setPlaceId(int placeId) {
    this.placeId = placeId;
  }

  /**
   * @return the eventId
   */
  public int getEventId() {
    return eventId;
  }

  /**
   * @param eventId the eventId to set
   */
  public void setEventId(int eventId) {
    this.eventId = eventId;
  }
}
