package co.com.udem.rumboteca.persistence.dao;

import java.util.List;

import co.com.udem.rumboteca.persistence.entity.Combo;
import co.com.udem.rumboteca.persistence.entity.Product;

public interface ComboDAO {
	
	public List<Combo> getCombo();

	public List<Combo> getComboTopTen();
	
	public List<Product> getProductsByComboId(int comboId);
}
