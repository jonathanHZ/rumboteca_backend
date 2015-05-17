package co.com.rumboteca.persistence.entity;

/**
 * This class manage product persistence
 * @author Milton
 */
public class Product {

  /** Product type: F-food, L-Liquor */
  private String productType;

  /** Name */
  private String name;

  /** Description */
  private String description;

  /** Photo's path */
  private String photo;

  /** Price */
  private int price;

  /** Identifier */
  private int id;

  /** Combo identifier */
  private int comboId;

  /**
   * @return the productType
   */
  public String getProductType() {
    return productType;
  }

  /**
   * @param productType the productType to set
   */
  public void setProductType(String productType) {
    this.productType = productType;
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
   * @return the comboId
   */
  public int getComboId() {
    return comboId;
  }

  /**
   * @param comboId the comboId to set
   */
  public void setComboId(int comboId) {
    this.comboId = comboId;
  }
}
