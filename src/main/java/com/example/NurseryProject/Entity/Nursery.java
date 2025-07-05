package com.example.NurseryProject.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="NurseryAdmin")
public class Nursery {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ProductId;
	private String ProductImg;
	private String ProductName;
	private String ProductDescription;
	private String ProductCategery;
	private int Productprice;
	
	public int getProductId() {
		return ProductId;
	}
	public void setProductId(int productId) {
		ProductId = productId;
	}
	public String getProductImg() {
		return ProductImg;
	}
	public void setProductImg(String productImg) {
		ProductImg = productImg;
	}

	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public String getProductCategery() {
		return ProductCategery;
	}
	public void setProductCategery(String productCategery) {
		ProductCategery = productCategery;
	}
	public int getProductprice() {
		return Productprice;
	}
	public void setProductprice(int productprice) {
		Productprice = productprice;
	}
	public Nursery( String productImg, String productName, String productDescription,
			String productCategery, int productprice) {
		super();
		ProductImg = productImg;
		ProductName = productName;
		ProductDescription = productDescription;
		ProductCategery = productCategery;
		Productprice = productprice;
	}
	public Nursery() {
		super();
	}
	
	
	
}
