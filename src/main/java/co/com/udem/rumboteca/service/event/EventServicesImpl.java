package co.com.udem.rumboteca.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.persistence.dao.EventDAO;
import co.com.udem.rumboteca.persistence.entity.Event;

/**
 * Event services implementation
 * @author Milton
 */
public class EventServicesImpl implements EventInterface {
	
	 // Get DAO implementation use spring injection 
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
  public List<EventDTO> getEventByCity(int idCity) {
    // Definitions
    List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
    EventDAO eventDAO = (EventDAO) context.getBean("eventDAO");
    
    // Service execute
    List<Event> eventList = eventDAO.getEventByCity(idCity);
    
    // Create event DTO
    for (Event event : eventList) {
      EventDTO eventDTO = new EventDTO();
      eventDTO.setId(""+event.getId());
      eventDTO.setDescription(event.getDescription());
      eventDTO.setPhoto(event.getPhoto());
      eventDTO.setTittle(event.getTittle());
      eventDTOList.add(eventDTO);
    }    
    
    return eventDTOList;
  }

  public List<EventDTO> getEventByState(int idState) {
  
    List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
    EventDAO eventDAO = (EventDAO) context.getBean("eventDAO");
    
    List<Event> eventList = eventDAO.getEventByCity(idState);
    for (Event event : eventList) {
      EventDTO eventDTO = new EventDTO();
      eventDTO.setId(""+event.getId());
      eventDTO.setDescription(event.getDescription());
      eventDTO.setPhoto(event.getPhoto());
      eventDTO.setTittle(event.getTittle());
      eventDTOList.add(eventDTO);
    }    
    
    return eventDTOList;
  }

  public List<EventDTO> getEventByCountry(int idCountry) {

    List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
    EventDAO eventDAO = (EventDAO) context.getBean("eventDAO");
    
    List<Event> eventList = eventDAO.getEventByCity(idCountry);
    for (Event event : eventList) {
      EventDTO eventDTO = new EventDTO();
      eventDTO.setId(""+event.getId());
      eventDTO.setDescription(event.getDescription());
      eventDTO.setPhoto(event.getPhoto());
      eventDTO.setTittle(event.getTittle());
      eventDTOList.add(eventDTO);
    }    
    
    return eventDTOList;
  }

  public void getEventTopTen() {
  }

  public List<EventDTO> getEventByLocation(String log, String lat) {
    return null;
  }
}
