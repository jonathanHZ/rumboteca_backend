package co.com.udem.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.persistence.dao.EventDAO;
import co.com.udem.rumboteca.persistence.entity.Event;

/**
 * Event database services implementation
 * 
 * @author Milton
 */
public class EventDAOImpl extends DataSourceDefinition implements EventDAO {

	// Object defition
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public List<Event> getEventByCity(int idCity) {
		// SQL Query
		String sql = "SELECT  e.id, e.contactId, p.id as placeId, e.tittle, e.description, e.photo "
				+ "FROM event e JOIN eventplace ep ON ep.eventId = e.id JOIN place p ON ep.placeId = p.id "
				+ "JOIN city c ON p.cityId = c.id WHERE c.Id = ?";

		List<Event> eventList = new ArrayList<Event>();

		try {
			// Get database connection
			conn = dataSource.getConnection();

			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCity);

			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setContactId(rs.getInt("contactId"));
				event.setPlaceId(rs.getInt("placeId"));
				event.setDescription(rs.getString("description"));
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

	@Override
	public List<Event> getEventByState(int idState) {
		// SQL Query
		String sql = "SELECT  e.id, e.contactId, p.id as placeId, e.tittle, e.description, e.photo "
				+ "FROM event e JOIN eventplace ep ON ep.eventId = e.id JOIN place p ON ep.placeId = p.id "
				+ "JOIN city c ON p.cityId = c.id join state st on c.stateId = st.id where st.id = ?";

		List<Event> eventList = new ArrayList<Event>();

		try {
			// Get database connection
			conn = dataSource.getConnection();

			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idState);

			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setContactId(rs.getInt("contactId"));
				event.setPlaceId(rs.getInt("placeId"));
				event.setDescription(rs.getString("description"));
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

	@Override
	public List<Event> getEventByCountry(int idCountry) {
		// SQL Query
		String sql = "SELECT  e.id, e.contactId, p.id as placeId, e.tittle, e.description, e.photo "
				+ "FROM event e JOIN eventplace ep ON ep.eventId = e.id JOIN place p ON ep.placeId = p.id "
				+ "JOIN city c ON p.cityId = c.id join state st on c.stateId = st.id "
				+ "JOIN country co on st.countryId = co.id where co.id = ?";

		List<Event> eventList = new ArrayList<Event>();

		try {
			// Get database connection
			conn = dataSource.getConnection();

			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCountry);

			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setContactId(rs.getInt("contactId"));
				event.setPlaceId(rs.getInt("placeId"));
				event.setDescription(rs.getString("description"));
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

	@Override
	public List<Event> getEventTopTen() {
		// SQL Query
		String sql = "SELECT distinctrow ev.id, ev.contactId, ev.placeId, ev.tittle, ev.description, ev.completDescription, ev.photo, ev.fecha,"
				+ "(SELECT count(co.id) FROM comment co Join review re ON co.reviewId = re.id Join eventreview er on re.id = er.reviewId "
				+ "where er.eventId = ev.id) As comments FROM event ev JOIN eventreview er ON ev.id = er.eventId "
				+ "JOIN review re ON er.reviewId = re.id JOIN comment co ON re.id = co.reviewId ORDER BY comments desc LIMIT 5";

		List<Event> eventList = new ArrayList<Event>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Event event = new Event();
				event.setId(rs.getInt("id"));
				event.setContactId(rs.getInt("contactId"));
				event.setPlaceId(rs.getInt("placeId"));
				event.setDescription(rs.getString("description"));
				event.setCompletDescription(rs.getString("completDescription"));
				event.setPhoto(rs.getString("photo"));
				event.setTittle(rs.getString("tittle"));
				event.setFecha(rs.getString("fecha"));
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

	@Override
	public List<EventDTO> getEventByLocation(String log, String lat) {
		return null;
	}
}
