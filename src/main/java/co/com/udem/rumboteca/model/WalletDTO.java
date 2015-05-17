package co.com.udem.rumboteca.model;

import java.io.Serializable;

/**
 * This class has combo's info
 * @author Milton
 */
public class WalletDTO implements Serializable {

  /**
   * 
   */
  private static final long serialVersionUID = 5245411422924750279L;

  private String price;

  private String tittle;

  private String description;

  /**
   * @return the price
   */
  public String getPrice() {
    return price;
  }

  /**
   * @param price the price to set
   */
  public void setPrice(String price) {
    this.price = price;
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
