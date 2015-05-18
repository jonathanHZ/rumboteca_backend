package co.com.udem.rumboteca.model;

public class ProductDTO {
	
	/** Product type: F-food, L-Liquor */
	private String productType;

	/** Name */
	private String name;

	/** Description */
	private String description;

	/** Photo's path */
	private String photo;

	/** Price */
	private int price;

	/** Identifier */
	private int id;

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
}
