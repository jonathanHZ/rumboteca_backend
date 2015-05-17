package co.com.udem.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.udem.rumboteca.persistence.dao.LocationDAO;
import co.com.udem.rumboteca.persistence.entity.Place;

public class LocationDAOImpl  extends DataSourceDefinition implements LocationDAO {
	
	// Object defition
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public List<Place> getLocationByCity(int idCity) {
		
		String sql = "SELECT * FROM place WHERE cityId = ?";

	    List<Place> placeList = new ArrayList<Place>();

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
	        Place place = new Place();
	        place.setId(rs.getInt("id"));
	        place.setDescription(rs.getString("description"));
	        place.setPhoto(rs.getString("photo"));
	        place.setTittle(rs.getString("tittle"));

	        placeList.add(place);
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

	    return placeList;

	}

	public List<Place> getLocationByState(int idState) {

		String sql = "SELECT pl.id, pl.tittle, pl.description, pl.photo FROM place pl JOIN city ci ON pl.cityId = ci.id WHERE ci.stateId = ?";

	    List<Place> placeList = new ArrayList<Place>();

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
	        Place place = new Place();
	        place.setId(rs.getInt("id"));
	        place.setDescription(rs.getString("description"));
	        place.setPhoto(rs.getString("photo"));
	        place.setTittle(rs.getString("tittle"));

	        placeList.add(place);
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

	    return placeList;
	}

	public List<Place> getLocationByCountry(int idCountry) {
		String sql = "SELECT pl.id, pl.tittle, pl.description, pl.photo "
				+"FROM place pl JOIN city ci ON pl.cityId = ci.id JOIN state st ON ci.stateId = st.id WHERE st.countryId = ?";

	    List<Place> placeList = new ArrayList<Place>();

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
	        Place place = new Place();
	        place.setId(rs.getInt("id"));
	        place.setDescription(rs.getString("description"));
	        place.setPhoto(rs.getString("photo"));
	        place.setTittle(rs.getString("tittle"));

	        placeList.add(place);
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

	    return placeList;
	}

	

}
