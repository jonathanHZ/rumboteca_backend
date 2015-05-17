package co.com.udem.rumboteca.persistence.dao;

import java.util.List;

import co.com.udem.rumboteca.persistence.entity.Place;

public interface LocationDAO {
	
	  public List<Place> getLocationByCity(int idCity);
	  public List<Place> getLocationByState(int idState);
	  public List<Place> getLocationByCountry(int idCountry);
	  
}
