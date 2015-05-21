package co.com.udem.rumboteca.service.location.site;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.rumboteca.model.CityDTO;
import co.com.udem.rumboteca.model.CountryDTO;
import co.com.udem.rumboteca.model.StateDTO;
import co.com.udem.rumboteca.persistence.dao.SiteDAO;
import co.com.udem.rumboteca.persistence.entity.City;
import co.com.udem.rumboteca.persistence.entity.Country;
import co.com.udem.rumboteca.persistence.entity.States;

public class SiteServiceImpl implements SiteInterface {

	ApplicationContext context = new ClassPathXmlApplicationContext(
			"Spring-Module.xml");
	SiteDAO siteDAO = (SiteDAO) context.getBean("siteDAO");

	@Override
	public List<CityDTO> getCities() {
		List<CityDTO> cityDTOs = new ArrayList<CityDTO>();
		List<City> cities = siteDAO.getCities();
		for (City city : cities) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setId(city.getId());
			cityDTO.setStateId(city.getStateId());
			cityDTO.setName(city.getName());
			cityDTOs.add(cityDTO);
		}
		return cityDTOs;
	}

	@Override
	public List<CityDTO> getCitiesById(int idCity) {
		List<CityDTO> cityDTOs = new ArrayList<CityDTO>();
		List<City> cities = siteDAO.getCitiesById(idCity);
		for (City city : cities) {
			CityDTO cityDTO = new CityDTO();
			cityDTO.setId(city.getId());
			cityDTO.setStateId(city.getStateId());
			cityDTO.setName(city.getName());
			cityDTOs.add(cityDTO);
		}
		return cityDTOs;
	}

	@Override
	public List<StateDTO> getStates() {
		List<StateDTO> stateDTOs = new ArrayList<StateDTO>();
		List<States> statesList = siteDAO.getStates();
		for (States states : statesList) {
			StateDTO stateDTO = new StateDTO();
			stateDTO.setId(states.getId());
			stateDTO.setCountryId(states.getCountryId());
			stateDTO.setName(states.getName());
			stateDTOs.add(stateDTO);
		}
		return stateDTOs;
	}

	@Override
	public List<StateDTO> getStatesById(int idState) {
		List<StateDTO> stateDTOs = new ArrayList<StateDTO>();
		List<States> statesList = siteDAO.getStatesById(idState);
		for (States states : statesList) {
			StateDTO stateDTO = new StateDTO();
			stateDTO.setId(states.getId());
			stateDTO.setCountryId(states.getCountryId());
			stateDTO.setName(states.getName());
			stateDTOs.add(stateDTO);
		}
		return stateDTOs;
	}

	@Override
	public List<CountryDTO> getCountries() {
		List<CountryDTO> countryDTOs = new ArrayList<CountryDTO>();
		List<Country> countries = siteDAO.getCountries();
		for (Country country : countries) {
			CountryDTO countryDTO = new CountryDTO();
			countryDTO.setId(country.getId());
			countryDTO.setName(country.getName());
			countryDTOs.add(countryDTO);
		}
		return countryDTOs;
	}

}
