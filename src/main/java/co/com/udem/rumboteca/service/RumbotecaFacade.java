package co.com.udem.rumboteca.service;

import java.util.List;

import co.com.udem.rumboteca.model.EventDTO;
import co.com.udem.rumboteca.model.PlaceDTO;
import co.com.udem.rumboteca.service.event.EventInterface;
import co.com.udem.rumboteca.service.event.EventServicesImpl;
import co.com.udem.rumboteca.service.location.LocationInterface;
import co.com.udem.rumboteca.service.location.LocationServicesImpl;

public class RumbotecaFacade {

	EventInterface eventInterface = new EventServicesImpl();

	public List<PlaceDTO> getLocationByCity(int idCity) {
		LocationInterface locationInterface = new LocationServicesImpl();
		return locationInterface.getLocationByCity(idCity);
	}

	public void getLocationByState(String idCountry, String idState) {
	}

	public void getLocationByCountry(String idCountry) {
	}

	public void getLocation(String log, String lat) {
	}

	public void getLocationTopTen() {
	}

	public List<EventDTO> getEventByCity(int idCity) {
		return eventInterface.getEventByCity(idCity);
	}

	public void getEventByState(String idCountry, String idState) {
	}

	public void getEventByCountry(String idCountry) {
	}

	public List<EventDTO> getEventTopTen() {
		return eventInterface.getEventTopTen();
	}

	public void getEventByLocation(String log, String lat) {
	}

	public void getLiquordComboByLocation(String idCountry, String idState,
			String idCity) {
	}

	public void getFoodByComboLocation(String idCountry, String idState,
			String idCity) {
	}

	public void getComboTopTen() {
	}

	public void getReviewByLocation(String idCountry, String idState,
			String idCity) {
	}

	public void getReviewTopTen() {
	}
}
