package co.com.udem.rumboteca.service.combo;

import java.util.List;

import co.com.udem.rumboteca.model.ComboDTO;

/**
 * 
 * @author Milton
 *
 */
public interface ComboInterface {

	public List<ComboDTO> getCombos();

	public List<ComboDTO> getComboTopTen();

}
