package co.com.udem.rumboteca.model;

import java.io.Serializable;
import java.util.List;

public class ComboDTO implements Serializable {

	private static final long serialVersionUID = -7814817158967887485L;

	/** Identifier */
	private int id;

	/** Name */
	private String name;

	/** Price */
	private int price;

	/** Place identifier */
	private int placeId;

	private String type;

	private List<ProductDTO> productDTOList;

	private String photo;

	private String description;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getPlaceId() {
		return placeId;
	}

	public void setPlaceId(int placeId) {
		this.placeId = placeId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ProductDTO> getProductDTOList() {
		return productDTOList;
	}

	public void setProductDTOList(List<ProductDTO> productDTOList) {
		this.productDTOList = productDTOList;
	}

}
