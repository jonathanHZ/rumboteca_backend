package co.com.udem.rumboteca.service.review;

import java.util.List;

import co.com.udem.rumboteca.model.ReviewDTO;

/**
 * 
 * @author Milton
 *
 */
public interface ReviewInterface {

  /**
   
   * @param idCity
   */
  public List<ReviewDTO> getReviewByLocation(int idCity);

  /**
   * 
   */
  public List<ReviewDTO> getReviewTopTen();
  
} 
