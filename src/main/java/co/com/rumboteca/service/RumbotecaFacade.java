package co.com.rumboteca.service;

import java.util.List;

import co.com.rumboteca.model.EventDTO;
import co.com.rumboteca.service.event.EventInterface;
import co.com.rumboteca.service.event.EventServicesImpl;
import co.com.rumboteca.service.location.LocationInterface;
import co.com.rumboteca.service.location.LocationServicesImpl;


/**
 * This class has all methods associated to Rumboteca web site
 * @author Milton
 * @version 1.0
 */
public class RumbotecaFacade {

  /**
   * 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public void getLocationByCity(String idCountry, String idState, String idCity) {
    LocationInterface locationInterface = new LocationServicesImpl();
    locationInterface.getLocationByCity(idCountry, idState, idCity);
  }

  public void getLocationByState(String idCountry, String idState) {
  }

  public void getLocationByCountry(String idCountry) {
  }

  public void getLocation(String log, String lat) {
  }

  public void getLocationTopTen() {
  }

  /**
   * Get all event associated to city identifier 
   * @param idCountry
   * @param idState
   * @param idCity
   */
  public List<EventDTO> getEventByCity(int idCity) {
    EventInterface event = new EventServicesImpl();
    return event.getEventByCity(idCity);
  }

  public void getEventByState(String idCountry, String idState) {
  }

  public void getEventByCountry(String idCountry) {
  }

  public void getEventTopTen() {
  }

  public void getEventByLocation(String log, String lat) {
  }

  public void getLiquordComboByLocation(String idCountry, String idState, String idCity) {
  }

  public void getFoodByComboLocation(String idCountry, String idState, String idCity) {
  }

  public void getComboTopTen() {
  }

  public void getReviewByLocation(String idCountry, String idState, String idCity) {
  }

  public void getReviewTopTen() {
  }
}
