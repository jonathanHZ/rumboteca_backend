package co.com.rumboteca.service.event;

import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.service.event.EventInterface;
import co.com.udem.rumboteca.service.event.EventServicesImpl;

/**
 * Event services test
 * @author Milton
 */
public class EventServicesImplTest {

  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
  }

  @AfterClass
  public static void tearDownAfterClass() throws Exception {
  }

  @Before
  public void setUp() throws Exception {
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testGetEventByCity() {
    int idCity = 1;
    EventInterface eventInterface = new EventServicesImpl();
    List<EventDTO> eventList = eventInterface.getEventByCity(idCity);
    for (EventDTO eventDTO : eventList) {
      System.out.println(eventDTO.getId());
      System.out.println(eventDTO.getTittle());
      System.out.println(eventDTO.getDescription());
      System.out.println(eventDTO.getPhoto());
    }
  }

}
