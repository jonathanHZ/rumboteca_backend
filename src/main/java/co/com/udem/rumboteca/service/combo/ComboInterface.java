package co.com.udem.rumboteca.service.combo;

/**
 * 
 * @author Milton
 *
 */
public interface ComboInterface {

  /**
   * 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public void getLiquorComboByLocation(String idCountry, String idState, String idCity);

  /**
   * 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public void getFoodByComboLocation(String idCountry, String idState, String idCity);

  /**
   * 
   */
  public void getComboTopTen();

}
