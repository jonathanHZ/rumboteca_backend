package co.com.udem.rumboteca.service;

import java.util.List;

import co.com.udem.rumboteca.model.CityDTO;
import co.com.udem.rumboteca.model.ComboDTO;
import co.com.udem.rumboteca.model.CountryDTO;
import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.model.PlaceDTO;
import co.com.udem.rumboteca.model.StateDTO;
import co.com.udem.rumboteca.service.combo.ComboInterface;
import co.com.udem.rumboteca.service.combo.ComboServicesImpl;
import co.com.udem.rumboteca.service.event.EventInterface;
import co.com.udem.rumboteca.service.event.EventServicesImpl;
import co.com.udem.rumboteca.service.location.LocationInterface;
import co.com.udem.rumboteca.service.location.LocationServicesImpl;
import co.com.udem.rumboteca.service.location.site.SiteInterface;
import co.com.udem.rumboteca.service.location.site.SiteServiceImpl;

public class RumbotecaFacade {

	EventInterface eventInterface = new EventServicesImpl();
	LocationInterface locationInterface = new LocationServicesImpl();
	SiteInterface siteInterface = new SiteServiceImpl();
	ComboInterface comboInterface = new ComboServicesImpl();

	public List<PlaceDTO> getLocationByCity(int idCity) {
		return locationInterface.getLocationByCity(idCity);
	}

	public List<PlaceDTO> getLocationByState(int idState) {
		return locationInterface.getLocationByState(idState);
	}

	public List<PlaceDTO> getLocationByCountry(int idCountry) {
		return locationInterface.getLocationByCountry(idCountry);
	}

	public void getLocation(String log, String lat) {
	}

	public List<PlaceDTO> getLocationTopTen() {
		return locationInterface.getLocationTopTen();
	}

	public List<EventDTO> getEventByCity(int idCity) {
		return eventInterface.getEventByCity(idCity);
	}

	public List<EventDTO> getEventByState(int idState) {
		return eventInterface.getEventByState(idState);
	}

	public List<EventDTO> getEventByCountry(int idCountry) {
		return eventInterface.getEventByCountry(idCountry);
	}

	public List<EventDTO> getEventTopTen() {
		return eventInterface.getEventTopTen();
	}

	public void getEventByLocation(String log, String lat) {
	}

	public List<ComboDTO> getCombos (){
		return comboInterface.getCombos();
	}

	public void getComboTopTen() {
	}

	public void getReviewByLocation(int city) {
	}

	public void getReviewTopTen() {
	}
	
	public List<CityDTO> getCities() {
		return siteInterface.getCities();
	}

	public List<CityDTO> getCitiesById(int idCity) {
		return siteInterface.getCitiesById(idCity);
	}

	public List<StateDTO> getStates() {
		return siteInterface.getStates();
	}

	public List<StateDTO> getStatesById(int idState) {
		return siteInterface.getStatesById(idState);
	}

	public List<CountryDTO> getCountries() {
		return siteInterface.getCountries();
	}
}
