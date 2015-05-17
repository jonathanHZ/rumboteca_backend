package co.com.udem.rumboteca.persistence.dao;

import java.util.List;

import co.com.udem.rumboteca.persistence.entity.City;
import co.com.udem.rumboteca.persistence.entity.Country;
import co.com.udem.rumboteca.persistence.entity.States;

public interface SiteDAO {

	public List<City> getCities();

	public List<City> getCitiesById(int idCity);

	public List<States> getStates();

	public List<States> getStatesById(int idState);

	public List<Country> getCountries();

}
