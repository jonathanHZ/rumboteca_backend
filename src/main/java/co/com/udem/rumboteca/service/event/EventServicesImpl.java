package co.com.udem.rumboteca.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.persistence.dao.EventDAO;
import co.com.udem.rumboteca.persistence.dao.LocationDAO;
import co.com.udem.rumboteca.persistence.entity.Event;
import co.com.udem.rumboteca.persistence.entity.Place;

/**
 * Event services implementation
 * 
 * @author Milton
 */
public class EventServicesImpl implements EventInterface {

	// Get DAO implementation use spring injection
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"Spring-Module.xml");
	EventDAO eventDAO = (EventDAO) context.getBean("eventDAO");
	LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");

	@Override
	public List<EventDTO> getEventByCity(int idCity) {

		List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
		List<Event> eventList = eventDAO.getEventByCity(idCity);

		for (Event event : eventList) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setId("" + event.getId());
			eventDTO.setDescription(event.getDescription());
			eventDTO.setPhoto(event.getPhoto());
			eventDTO.setTittle(event.getTittle());
			eventDTOList.add(eventDTO);
		}

		return eventDTOList;
	}

	@Override
	public List<EventDTO> getEventByState(int idState) {

		List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
		List<Event> eventList = eventDAO.getEventByCity(idState);

		for (Event event : eventList) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setId("" + event.getId());
			eventDTO.setDescription(event.getDescription());
			eventDTO.setPhoto(event.getPhoto());
			eventDTO.setTittle(event.getTittle());
			eventDTOList.add(eventDTO);
		}

		return eventDTOList;
	}

	@Override
	public List<EventDTO> getEventByCountry(int idCountry) {

		List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
		List<Event> eventList = eventDAO.getEventByCity(idCountry);

		for (Event event : eventList) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setId("" + event.getId());
			eventDTO.setDescription(event.getDescription());
			eventDTO.setPhoto(event.getPhoto());
			eventDTO.setTittle(event.getTittle());
			eventDTOList.add(eventDTO);
		}

		return eventDTOList;
	}

	@Override
	public List<EventDTO> getEventTopTen() {

		List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
		List<Event> eventList = eventDAO.getEventTopTen();

		for (Event event : eventList) {
			EventDTO eventDTO = new EventDTO();
			eventDTO.setId("" + event.getId());
			eventDTO.setDescription(event.getDescription());
			eventDTO.setCompletDescription(event.getCompletDescription());
			eventDTO.setPhoto(event.getPhoto());
			eventDTO.setTittle(event.getTittle());
			eventDTO.setFecha(event.getFecha());;
			System.out.println(event.getPlaceId());
			Place place = locationDAO.getLocationById(event.getPlaceId());
			eventDTO.setPlaceTittle(place.getTittle());
			eventDTOList.add(eventDTO);
		}

		return eventDTOList;
	}

	@Override
	public List<EventDTO> getEventByLocation(String log, String lat) {
		return null;
	}
}
