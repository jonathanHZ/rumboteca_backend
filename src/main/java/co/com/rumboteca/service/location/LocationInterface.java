package co.com.rumboteca.service.location;

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
  public void getLocationByCity(String idCountry, String idState, String idCity);

  /**
   * 
   * @param idCountry
   * @param idState
   */
  public void getLocationByState(String idCountry, String idState);

  /**
   * 
   * @param idCountry
   */
  public void getLocationByCountry(String idCountry);

  /**
   * 
   * @param log
   * @param lat
   */
  public void getLocation(String log, String lat);

  /**
   * 
   */
  public void getLocationTopTen();

}
