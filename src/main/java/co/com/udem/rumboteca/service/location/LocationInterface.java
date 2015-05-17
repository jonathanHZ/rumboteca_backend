package co.com.udem.rumboteca.service.location;

import java.util.List;

import co.com.udem.rumboteca.model.PlaceDTO;

/**
 * 
 * @author Milton
 *
 */
public interface LocationInterface {

  /**
   * 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public List<PlaceDTO> getLocationByCity(int idCity);

  /**
   * 
   * @param idCountry
   * @param idState
   */
  public List<PlaceDTO> getLocationByState(int idState);

  /**
   * 
   * @param idCountry
   */
  public List<PlaceDTO> getLocationByCountry(int idCountry);

  
  public void getLocationTopTen();

}
