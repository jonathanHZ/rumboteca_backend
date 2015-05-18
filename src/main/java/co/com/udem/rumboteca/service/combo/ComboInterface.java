package co.com.udem.rumboteca.service.combo;

import java.util.List;

import co.com.udem.rumboteca.model.ComboDTO;
import co.com.udem.rumboteca.persistence.entity.Combo;
import co.com.udem.rumboteca.persistence.entity.Product;

/**
 * 
 * @author Milton
 *
 */
public interface ComboInterface {

	public List<ComboDTO> getCombos();

	public List<ComboDTO> getComboTopTen();

}
