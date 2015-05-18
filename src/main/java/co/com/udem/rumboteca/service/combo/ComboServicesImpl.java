package co.com.udem.rumboteca.service.combo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.com.udem.rumboteca.model.ComboDTO;
import co.com.udem.rumboteca.model.ProductDTO;
import co.com.udem.rumboteca.persistence.dao.ComboDAO;
import co.com.udem.rumboteca.persistence.entity.Combo;
import co.com.udem.rumboteca.persistence.entity.Product;

public class ComboServicesImpl implements ComboInterface {

	// Get DAO implementation use spring injection
	ApplicationContext context = new ClassPathXmlApplicationContext(
			"Spring-Module.xml");
	ComboDAO comboDAO = (ComboDAO) context.getBean("comboDAO");
	
	public List<ComboDTO> getCombos() {
		List<ComboDTO> comboDTOs = new ArrayList<ComboDTO>();
		List<Combo> combos = comboDAO.getCombo();
		
		for (Combo combo : combos) {
			ComboDTO comboDTO = new ComboDTO();
			comboDTO.setId(combo.getId());
			comboDTO.setPlaceId(combo.getPlaceId());
			comboDTO.setName(combo.getName());
			comboDTO.setPrice(combo.getPrice());
			
			List<ProductDTO> productDTOs = new ArrayList<ProductDTO>();
			List<Product> products = comboDAO.getProductsByComboId(comboDTO.getId());
			for (Product product : products) {
				ProductDTO productDTO = new ProductDTO();
				productDTO.setId(product.getId());
				productDTO.setName(product.getName());
				productDTO.setDescription(product.getDescription());
				productDTO.setPhoto(product.getPhoto());
				productDTO.setPrice(product.getPrice());
				productDTO.setProductType(product.getProductType());
				productDTOs.add(productDTO);
			}
			comboDTO.setProductDTOList(productDTOs);
			comboDTOs.add(comboDTO);
		}
		return comboDTOs;
	}
	public List<ComboDTO> getComboTopTen() {
		// TODO Auto-generated method stub
		return null;
	}



}
