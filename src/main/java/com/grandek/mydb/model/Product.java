/**
 *
 * @author Ekkachai.K
 * @date Dec 26, 2014
 */
package com.grandek.mydb.model;

import java.io.Serializable;
import java.sql.Blob;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonView;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@Table(name="PRODUCT")
@Repository
//@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "productId")
public class Product implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer productId;
	private String productName;
	private double price;
	private Blob image;
	
	//Relation to category @ManyToOne
	private Category category;
	
	private Set<OrderDetails> orderDetails = new HashSet<OrderDetails>();
	@JsonView(Views.Public.class)
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "PRODUCT_ID", unique = true, nullable = false)
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	@JsonView(Views.Public.class)
	@Column(name = "PRODUCT_NAME", length = 50, nullable = false)
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	@JsonView(Views.Public.class)
	@Column(name = "PRICE", precision=18 , scale= 2, nullable = false)
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	@Column(name = "IMAGE")
	public Blob getImage() {
		return image;
	}
	public void setImage(Blob image) {
		this.image = image;
	}
	@JsonView(Views.Public.class)
//	@JsonManagedReference
	@ManyToOne
	@JoinColumn(name="CATEGORY_ID",referencedColumnName="CATEGORY_ID" )
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category productCategory) {
		this.category = productCategory;
	}
	
	@JsonIgnore
	@OneToMany (mappedBy = "product")
	public Set<OrderDetails> getOrderDetails() {
		return orderDetails;
	}
	public void setOrderDetails(Set<OrderDetails> orderDetails) {
		this.orderDetails = orderDetails;
	}
	
}
