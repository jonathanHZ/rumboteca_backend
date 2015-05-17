package co.com.rumboteca.persistence.entity;

/**
 * This class manage state persistence
 * @author Milton
 */
public class States {

  /** Identifier */
  private int id;

  /** Name */
  private String name;

  /** Country identifier */
  private int countryId;

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
   * @return the countryId
   */
  public int getCountryId() {
    return countryId;
  }

  /**
   * @param countryId the countryId to set
   */
  public void setCountryId(int countryId) {
    this.countryId = countryId;
  }
}
