package co.com.rumboteca.persistence.advertisement.jdbc.dao;

import co.com.rumboteca.persistence.advertisement.jdbc.entity.Advertisement;

/**
 * This class manage Advertisement data from database
 * @author Milton
 */
public interface AdvertisementDAO {

  /**
   * Insert Advertisement into database
   * @param advertisement
   */
  public void insert(Advertisement advertisement);

  /**
   * Get Advertisement from database
   * @param custId
   * @return
   */
  public Advertisement findByAdvertisementId(int custId);

}
