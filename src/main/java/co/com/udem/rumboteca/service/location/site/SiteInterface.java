package co.com.udem.rumboteca.service.location.site;

import java.util.List;

import co.com.udem.rumboteca.model.CityDTO;
import co.com.udem.rumboteca.model.CountryDTO;
import co.com.udem.rumboteca.model.StateDTO;

public interface SiteInterface {
	
	public List<CityDTO> getCities();

	public List<CityDTO> getCitiesById(int idCity);

	public List<StateDTO> getStates();

	public List<StateDTO> getStatesById(int idState);

	public List<CountryDTO> getCountries();
}
