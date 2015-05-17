package co.com.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.rumboteca.model.EventDTO;
import co.com.rumboteca.persistence.dao.EventDAO;
import co.com.rumboteca.persistence.entity.Event;


/**
 * Event database services implementation
 * @author Milton
 */
public class EventDAOImpl extends DataSourceDefinition implements EventDAO {

  /**
   * Get all event associated to city identifier
   * @param idCity
   */
  public List<Event> getEventByCity(int idCity) {

    // SQL Query
    String sql = "SELECT e.contactId, e.description, e.id, e.photo, e.tittle " 
        + " FROM event e" 
        + " JOIN placeevent ep" 
        + " ON ep.eventId = e.id"
        + " JOIN place p" 
        + " ON ep.placeId = p.id" 
        + " JOIN city c" 
        + " ON p.cityId = c.id" 
        + " WHERE c.Id = ?";

    // Object defition
    Connection conn = null;
    List<Event> eventList = new ArrayList<Event>();

    try {
      // Get database connection
      conn = dataSource.getConnection();
      
      // Prepared statement to execute
      PreparedStatement ps = conn.prepareStatement(sql);
      ps.setInt(1, idCity);
      
      // Query execute
      ResultSet rs = ps.executeQuery();

      // Iterate result set
      while (rs.next()) {
        Event event = new Event();
        event.setContactId(rs.getInt("contactId"));
        event.setDescription(rs.getString("description"));
        event.setId(rs.getInt("id"));
        event.setPhoto(rs.getString("photo"));
        event.setTittle(rs.getString("tittle"));

        eventList.add(event);
      }

      // Close resources
      rs.close();
      ps.close();
      
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } finally {
      // Close database connection
      if (conn != null) {
        try {
          conn.close();
        } catch (SQLException e) {
        }
      }
    }

    return eventList;
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
