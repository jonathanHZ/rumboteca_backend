package co.com.rumboteca.service.event;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.rumboteca.model.EventDTO;
import co.com.rumboteca.persistence.dao.EventDAO;
import co.com.rumboteca.persistence.entity.Event;

/**
 * Event services implementation
 * @author Milton
 */
public class EventServicesImpl implements EventInterface {

  public List<EventDTO> getEventByCity(int idCity) {
    // Definitions
    List<EventDTO> eventDTOList = new ArrayList<EventDTO>();
    
    // Get DAO implementation use spring injection 
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
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

  public void getEventByState(String idCountry, String idState) {
  }

  public void getEventByCountry(String idCountry) {
  }

  public void getEventTopTen() {
  }

  public List<EventDTO> getEventByLocation(String log, String lat) {
    return null;
  }
}
