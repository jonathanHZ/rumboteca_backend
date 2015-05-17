package co.com.rumboteca.service.review;

/**
 * 
 * @author Milton
 *
 */
public interface ReviewInterface {

  /**
   * 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public void getReviewByLocation(String idCountry, String idState, String idCity);

  /**
   * 
   */
  public void getReviewTopTen();
  
} 
