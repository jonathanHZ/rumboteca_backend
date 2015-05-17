package co.com.rumboteca.persistence.dao;

import java.util.List;

import co.com.rumboteca.model.EventDTO;
import co.com.rumboteca.persistence.entity.Event;

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
   * @param idCountry
   * @param idState
   */
  public void getEventByState(String idCountry, String idState);

  /**
   * 
   * @param idCountry
   */
  public void getEventByCountry(String idCountry);

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
