package co.com.rumboteca.model;

import java.io.Serializable;

/**
 * This class has info associated to the event's and location's reviews
 * @author Milton
 */
public class WallDTO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = -6448392191864284607L;

  private String photo;

  private String tittle;

  private String description;

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
}
