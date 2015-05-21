package co.com.udem.rumboteca.persistence.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.com.udem.rumboteca.persistence.dao.SiteDAO;
import co.com.udem.rumboteca.persistence.entity.City;
import co.com.udem.rumboteca.persistence.entity.Country;
import co.com.udem.rumboteca.persistence.entity.States;

public class SIteDAOImpl extends DataSourceDefinition implements SiteDAO {

	// Object defition
	Connection conn = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	@Override
	public List<City> getCities() {
		String sql = "SELECT * FROM city";
		List<City> cities = new ArrayList<City>();

		try {
			// Get database connection
			conn = dataSource.getConnection();
			// Prepared statement to execute
			ps = conn.prepareStatement(sql);
			// Query execute
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				City city = new City();
				city.setId(rs.getInt("id"));
				city.setStateId(rs.getInt("stateId"));
				city.setName(rs.getString("name"));
				cities.add(city);
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

		return cities;
	}

	@Override
	public List<City> getCitiesById(int idCity) {
		String sql = "SELECT * FROM city WHERE ID = ?";
		List<City> cities = new ArrayList<City>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idCity);
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				City city = new City();
				city.setId(rs.getInt("id"));
				city.setStateId(rs.getInt("stateId"));
				city.setName(rs.getString("name"));
				cities.add(city);
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

		return cities;
	}

	@Override
	public List<States> getStates() {
		String sql = "SELECT * FROM state";
		List<States> states = new ArrayList<States>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				States state = new States();
				state.setId(rs.getInt("id"));
				state.setCountryId(rs.getInt("countryId"));
				state.setName(rs.getString("name"));
				states.add(state);
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

		return states;
	}

	@Override
	public List<States> getStatesById(int idState) {
		String sql = "SELECT * FROM state WHERE id = ?";
		List<States> states = new ArrayList<States>();

		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			ps.setInt(1, idState);
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				States state = new States();
				state.setId(rs.getInt("id"));
				state.setCountryId(rs.getInt("countryId"));
				state.setName(rs.getString("name"));
				states.add(state);
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

		return states;
	}

	@Override
	public List<Country> getCountries() {
		List<Country> countries = new ArrayList<Country>();
		String sql = "SELECT * FROM country";
		try {
			conn = dataSource.getConnection();
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();

			// Iterate result set
			while (rs.next()) {
				Country country = new Country();
				country.setId(rs.getInt("id"));
				country.setName(rs.getString("name"));
				countries.add(country);
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

		return countries;
	}

}
