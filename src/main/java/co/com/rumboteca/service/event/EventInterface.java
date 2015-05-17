package co.com.rumboteca.service.event;

import java.util.List;

import co.com.rumboteca.model.EventDTO;

/**
 * Event services definition
 * @author Milton
 */
public interface EventInterface {

  /**
   * Get all event associated to city identifier 
   * @param idCity
   */
  public List<EventDTO> getEventByCity(int idCity) ;

  /**
   * Get all event associated to state identifier
   * @param idCountry
   * @param idState
   */
  public void getEventByState(String idCountry, String idState);

  /**
   * Get all event associated to country identifier
   * @param idCountry
   */
  public void getEventByCountry(String idCountry);

  /**
   * Get the main events
   */
  public void getEventTopTen();

  /**
   * Get all event near to gps location
   * @param log
   * @param lat
   */
  public List<EventDTO> getEventByLocation(String log, String lat);
}
