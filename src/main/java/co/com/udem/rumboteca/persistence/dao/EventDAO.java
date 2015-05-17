package co.com.udem.rumboteca.persistence.dao;

import java.util.List;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.persistence.entity.Event;

/**
 * Event database services definition
 * @author Milton
 */
public interface EventDAO {

  /**
   * Get all event associated to city identifier 
   * @param idCity
   */
  public List<Event> getEventByCity(int idCity) ;

  /**
   * 
   * @param idState
   */
  public List<Event> getEventByState(int idState);

  /**
   * 
   * @param idCountry
   */
  public List<Event> getEventByCountry(int idCountry);

  /**
   * 
   */
  public void getEventTopTen();

  /**
   * 
   * @param log
   * @param lat
   */
  public List<EventDTO> getEventByLocation(String log, String lat);
}
