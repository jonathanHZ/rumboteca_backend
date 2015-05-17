package co.com.rumboteca.persistence.entity;

/**
 * This class manage combo persistence
 * @author Milton
 */
public class Combo {

  /** Identifier */
  private int id;

  /** Name */
  private String name;

  /** Price */
  private int price;

  /** Place identifier */
  private int placeId;

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
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * @param name the name to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * @return the price
   */
  public int getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(int price) {
    this.price = price;
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
}
