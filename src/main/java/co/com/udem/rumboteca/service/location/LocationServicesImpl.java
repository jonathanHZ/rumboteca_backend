package co.com.udem.rumboteca.service.location;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.rumboteca.model.PlaceDTO;
import co.com.udem.rumboteca.persistence.dao.LocationDAO;
import co.com.udem.rumboteca.persistence.entity.Place;

/**
 * 
 * @author Milton
 *
 */
public class LocationServicesImpl implements LocationInterface {
	
	 // Get DAO implementation use spring injection 
    ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

	public List<PlaceDTO> getLocationByCity(int idCity) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
	    LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");
	    List<Place> places = locationDAO.getLocationByCity(1);
	    
	    for (Place place : places) {
			PlaceDTO placeDTO = new PlaceDTO();
			placeDTO.setTittle(place.getTittle());
			placeDTO.setPhoto(place.getPhoto());
			placeDTO.setDescription(place.getDescription());
			
			placeDTOList.add(placeDTO);
		}
	    
	    return placeDTOList;
	}

	public List<PlaceDTO> getLocationByState(int idState) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
	    LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");
	    List<Place> places = locationDAO.getLocationByState(1);
	    
	    for (Place place : places) {
			PlaceDTO placeDTO = new PlaceDTO();
			placeDTO.setTittle(place.getTittle());
			placeDTO.setPhoto(place.getPhoto());
			placeDTO.setDescription(place.getDescription());
			
			placeDTOList.add(placeDTO);
		}
	    
	    return placeDTOList;
	}

	public List<PlaceDTO> getLocationByCountry(int idCountry) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
	    LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");
	    List<Place> places = locationDAO.getLocationByCountry(1);
	    
	    for (Place place : places) {
			PlaceDTO placeDTO = new PlaceDTO();
			placeDTO.setId(place.getId());
			placeDTO.setTittle(place.getTittle());
			placeDTO.setPhoto(place.getPhoto());
			placeDTO.setDescription(place.getDescription());
			
			placeDTOList.add(placeDTO);
		}
	    
	    return placeDTOList;
	}

	public void getLocationTopTen() {
		// TODO Auto-generated method stub
		
	}
  
}
