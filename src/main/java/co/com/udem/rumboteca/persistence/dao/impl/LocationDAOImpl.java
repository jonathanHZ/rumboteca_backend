package co.com.udem.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.udem.rumboteca.persistence.dao.LocationDAO;
import co.com.udem.rumboteca.persistence.entity.Contact;
import co.com.udem.rumboteca.persistence.entity.Place;

public class LocationDAOImpl extends DataSourceDefinition implements
		LocationDAO {

	// Object defition
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
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

	@Override
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

	@Override
	public List<Place> getLocationByCountry(int idCountry) {
		String sql = "SELECT pl.id, pl.tittle, pl.description, pl.photo "
				+ "FROM place pl JOIN city ci ON pl.cityId = ci.id JOIN state st ON ci.stateId = st.id WHERE st.countryId = ?";

		List<Place> placeList = new ArrayList<Place>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCountry);
			rs = ps.executeQuery();

			while (rs.next()) {
				Place place = new Place();
				place.setId(rs.getInt("id"));
				place.setDescription(rs.getString("description"));
				place.setPhoto(rs.getString("photo"));
				place.setTittle(rs.getString("tittle"));

				placeList.add(place);
			}

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

	@Override
	public List<Place> getLocationTopTen() {
		String sql = "SELECT distinctrow plc.id, plc.tittle, plc.description, plc.completDescription, plc.direction, plc.photo, plc.contactId,"
				+ "(SELECT count(co.id) FROM comment co JOIN review re ON co.reviewId = re.id JOIN placereview plr ON re.id = plr.reviewId "
				+ "JOIN place pl ON plr.placeId = pl.id where plr.placeId = plc.id) AS comments FROM place plc "
				+ "JOIN placereview pr ON plc.id = pr.placeId JOIN review rev ON pr.reviewId = rev.id JOIN comment com ON rev.id = com.reviewId "
				+ "ORDER BY comments desc LIMIT 3";

		List<Place> placeList = new ArrayList<Place>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				Place place = new Place();
				place.setId(rs.getInt("id"));
				place.setDescription(rs.getString("description"));
				place.setCompletDescription(rs.getString("completDescription"));
				place.setPhoto(rs.getString("photo"));
				place.setTittle(rs.getString("tittle"));
				place.setDirection(rs.getString("direction"));
				place.setContactId(rs.getInt("contactId"));
				placeList.add(place);
			}

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

	@Override
	public Place getLocationById(int id) {
		// 
		String sql = "SELECT id, tittle, description, photo FROM place WHERE id ="+id;

		Place place = new Place(); 

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			while (rs.next()) {
				place.setId(rs.getInt("id"));
				place.setDescription(rs.getString("description"));
				place.setPhoto(rs.getString("photo"));
				place.setTittle(rs.getString("tittle"));
			}

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

		return place;
	}

	@Override
	public Contact getContactById(int id) {
		String sql = "SELECT id, firtsName, lastName, email, address, facebookId, mobile, telephone, twitterId  FROM contact WHERE id = ?";
		Contact contact = new Contact();
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			rs = ps.executeQuery();
			
			while (rs.next()) {
				contact.setId(rs.getInt("id"));
				contact.setFirstName(rs.getString("firtsName"));
				contact.setLastName(rs.getString("lastName"));
				contact.setEmail(rs.getString("email"));
				contact.setAddress(rs.getString("address"));
				contact.setFacebookId(rs.getString("facebookId"));
				contact.setMobile(rs.getString("mobile"));
				contact.setTelephone(rs.getString("telephone"));
				contact.setTwiterId(rs.getString("twitterId"));
			}
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

		return contact;

	}

}
