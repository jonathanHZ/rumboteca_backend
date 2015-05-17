package co.com.udem.rumboteca.persistence.entity;

/**
 * This class manage country persistence
 * @author Milton
 */
public class Country {

  /** Identifier */
  private int id;

  /** Name */
  private String name;

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
}
