package co.com.udem.rumboteca.service.advertisment;

import java.util.List;

import co.com.udem.rumboteca.model.AdvertisementDTO;

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
