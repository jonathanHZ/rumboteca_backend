package co.com.udem.rumboteca.service.event;

import java.util.List;

import co.com.udem.rumboteca.model.EventDTO;

/**
 * Event services definition
 * 
 * @author Milton
 */
public interface EventInterface {

	/**
	 * Get all event associated to city identifier
	 * 
	 * @param idCity
	 */
	public List<EventDTO> getEventByCity(int idCity);

	/**
	 * Get all event associated to state identifier
	 * 
	 * @param idState
	 */
	public List<EventDTO> getEventByState(int idState);

	/**
	 * Get all event associated to country identifier
	 * 
	 * @param idCountry
	 */
	public List<EventDTO> getEventByCountry(int idCountry);

	/**
	 * Get the main events
	 */
	public List<EventDTO> getEventTopTen();

	/**
	 * Get all event near to gps location
	 * 
	 * @param log
	 * @param lat
	 */
	public List<EventDTO> getEventByLocation(String log, String lat);
}
