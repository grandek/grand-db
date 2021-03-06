/**
 *
 * @author Ekkachai.K
 * @date Apr 4, 2015
 */
package com.grandek.mydb.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="CUSTOMER")
@Repository
public class Customer implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer customerId;
	private String customerName;
	
	private Set<Orders> orders = new HashSet<Orders>();
	
	@Id
	@GeneratedValue
	@Column( name = "CUSTOMER_ID" )
	public Integer getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	
	@Column( name = "CUSTOMER_NAME")
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@JsonIgnore
	@OneToMany( mappedBy= "customer")
	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
}
