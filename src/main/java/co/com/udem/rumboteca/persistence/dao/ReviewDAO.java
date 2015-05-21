package co.com.udem.rumboteca.persistence.dao;

import java.util.List;

import co.com.udem.rumboteca.persistence.entity.Review;

public interface ReviewDAO {
	/**
	 * 
	 * @param idCity
	 */
	public List<Review> getReviewByLocation(int idCity);

	/**
	   * 
	   */
	public List<Review> getReviewTopTen();
}
