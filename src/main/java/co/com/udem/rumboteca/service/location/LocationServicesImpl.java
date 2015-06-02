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
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"Spring-Module.xml");
	LocationDAO locationDAO = (LocationDAO) context.getBean("locationDAO");

	@Override
	public List<PlaceDTO> getLocationByCity(int idCity) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();

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

	@Override
	public List<PlaceDTO> getLocationByState(int idState) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
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

	@Override
	public List<PlaceDTO> getLocationByCountry(int idCountry) {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
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

	@Override
	public List<PlaceDTO> getLocationTopTen() {
		List<PlaceDTO> placeDTOList = new ArrayList<PlaceDTO>();
		List<Place> places = locationDAO.getLocationTopTen();

		for (Place place : places) {
			PlaceDTO placeDTO = new PlaceDTO();
			placeDTO.setId(place.getId());
			placeDTO.setTittle(place.getTittle());
			placeDTO.setPhoto(place.getPhoto());
			placeDTO.setDescription(place.getDescription());
			placeDTO.setCompletDescription(place.getCompletDescription());
			placeDTO.setDirection(place.getDirection());
			placeDTO.setContact(locationDAO.getContactById(place.getContactId()));
			placeDTOList.add(placeDTO);
		}

		return placeDTOList;

	}

}
