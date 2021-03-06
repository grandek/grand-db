/**
 *
 * @author Ekkachai.K
 * @date Apr 4, 2015
 */
package com.grandek.mydb.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatTypes;

@Entity
@Table( name = "EMPLOYEE")
@Repository
public class Employee implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private Integer employeeId;
	private String firstName;
	private String lastName;
	private Date birthDay;
	
	private Set<Orders> orders = new HashSet<Orders>();
	
	@Id
	@GeneratedValue
	@Column( name = "EMPLOYEE_ID")
	public Integer getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}
	@Column( name = "FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	@Column( name = "LAST_NAME")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@JsonFormat(pattern = "dd-MM-yyyy",shape=JsonFormat.Shape.STRING)
	@Column( name = "BIRTHDAY")
	public Date getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}
	
	@JsonIgnore
	@OneToMany( mappedBy= "employee")
	public Set<Orders> getOrders() {
		return orders;
	}

	public void setOrders(Set<Orders> orders) {
		this.orders = orders;
	}
	
}
