package co.com.rumboteca.model;

import java.io.Serializable;

/**
 * This class has advertisement data model
 * @author Milton
 */
public class AdvertisementDTO implements Serializable {

  /** Serial ID */
  private static final long serialVersionUID = -6023941844327966717L;

  /** Photo's path. */
  private String photo;

  /** Photo's title to show. */
  private String tittle;

  /** Photo's description to show. */
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
