package co.com.rumboteca.persistence.entity;

/**
 * This class manage contact persistence
 * @author Milton
 */
public class Contact {

  /** Email */
  private String email;

  /** Telephone number */
  private String telephone;

  /** Cellphone number */
  private String mobile;

  /** First name */
  private String firstName;

  /** Last name */
  private String lastName;

  /** Facebook user */
  private String facebookId;

  /** Twiter user */
  private String twiterId;

  /** Address */
  private String address;

  /** Identifier */
  private int id;

  /**
   * @return the email
   */
  public String getEmail() {
    return email;
  }

  /**
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * @return the telephone
   */
  public String getTelephone() {
    return telephone;
  }

  /**
   * @param telephone the telephone to set
   */
  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }

  /**
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }

  /**
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  /**
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }

  /**
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }

  /**
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * @return the facebookId
   */
  public String getFacebookId() {
    return facebookId;
  }

  /**
   * @param facebookId the facebookId to set
   */
  public void setFacebookId(String facebookId) {
    this.facebookId = facebookId;
  }

  /**
   * @return the twiterId
   */
  public String getTwiterId() {
    return twiterId;
  }

  /**
   * @param twiterId the twiterId to set
   */
  public void setTwiterId(String twiterId) {
    this.twiterId = twiterId;
  }

  /**
   * @return the address
   */
  public String getAddress() {
    return address;
  }

  /**
   * @param address the address to set
   */
  public void setAddress(String address) {
    this.address = address;
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
}
