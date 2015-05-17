package co.com.rumboteca.service.advertisement;

import java.util.List;

import co.com.rumboteca.model.AdvertisementDTO;

/**
 * This class has advertisement's services 
 * @author Milton
 */
public interface AdvertisementInterface {

  /**
   * Get the advertisements associated to main page
   * @return List {@link AdvertisementDTO}
   */
  public List<AdvertisementDTO> getAdvertisementMainPage();
}
