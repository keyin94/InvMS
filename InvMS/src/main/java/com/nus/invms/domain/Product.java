package com.nus.invms.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
<<<<<<< HEAD
import javax.validation.constraints.*;

import lombok.Data;
import lombok.NoArgsConstructor;
=======
import javax.persistence.Table;
>>>>>>> refs/heads/joe_branch

@Entity
<<<<<<< HEAD
@Data
@NoArgsConstructor
=======
@Table(name = "product")
>>>>>>> refs/heads/joe_branch
public class Product {
	
	@Id
<<<<<<< HEAD
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int partNumber;
	@NotNull
	private int reorderLevel, minReorderQty; 
	@NotEmpty
	private String productName, description, colour, dimension, manufacturer, shelfLocation;
	@NotNull
	private Double unitPrice;
	private Status status;
	
	public Product(int reorderLevel, int minReorderQty, String productName, String description, String colour,
			String dimension, String manufacturer, String shelfLocation, Double unitPrice) {
		super();
		this.reorderLevel = reorderLevel;
		this.minReorderQty = minReorderQty;
		this.productName = productName;
		this.description = description;
		this.colour = colour;
		this.dimension = dimension;
		this.manufacturer = manufacturer;
		this.shelfLocation = shelfLocation;
		this.unitPrice = unitPrice;
	} 
	
	
=======
	@GeneratedValue(strategy = GenerationType.AUTO)
	int partNumber;
	
	int reorderLevel, minReorderQty; 
	String productName, description, colour, dimension, manufacturer, shelfLocation;
	Double unitPrice; 
	
	

	public Product(int reorderLevel, int minReorderQty, String productName, String description, String colour,
			String dimension, String manufacturer, String shelfLocation, Double unitPrice) {
		super();
		this.reorderLevel = reorderLevel;
		this.minReorderQty = minReorderQty;
		this.productName = productName;
		this.description = description;
		this.colour = colour;
		this.dimension = dimension;
		this.manufacturer = manufacturer;
		this.shelfLocation = shelfLocation;
		this.unitPrice = unitPrice;
	}

	public int getReorderLevel() {
		return reorderLevel;
	}

	public void setReorderLevel(int reorderLevel) {
		this.reorderLevel = reorderLevel;
	}

	public int getMinReorderQty() {
		return minReorderQty;
	}

	public void setMinReorderQty(int minReorderQty) {
		this.minReorderQty = minReorderQty;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getDimension() {
		return dimension;
	}

	public void setDimension(String dimension) {
		this.dimension = dimension;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getShelfLocation() {
		return shelfLocation;
	}

	public void setShelfLocation(String shelfLocation) {
		this.shelfLocation = shelfLocation;
	}

	public Double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
>>>>>>> refs/heads/joe_branch


}
