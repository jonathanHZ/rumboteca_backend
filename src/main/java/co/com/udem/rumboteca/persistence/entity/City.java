package co.com.udem.rumboteca.persistence.entity;

/**
 * This class manage city persistence
 * @author Milton
 */
public class City {
  
  /** Identifier */
  private int id;

  /** Name */
  private String name;

  /** State identifier */
  private int stateId;

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
   * @return the stateId
   */
  public int getStateId() {
    return stateId;
  }

  /**
   * @param stateId the stateId to set
   */
  public void setStateId(int stateId) {
    this.stateId = stateId;
  }
}
