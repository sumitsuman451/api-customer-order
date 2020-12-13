package com.rest.api.models;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="order_table")
public class Order {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    private String name;
    private String address;
    private String city;
    
    @Column(name="total_price")
    private String totalPrice;
    private String type;
    
    @ManyToOne
    @JsonIgnore
    private Customer customer;
    
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(String name, String address, String city, String totalPrice, String type) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.totalPrice = totalPrice;
		this.type = type;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(String totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", address=" + address + ", city=" + city + ", totalPrice="
				+ totalPrice + ", type=" + type + "]";
	}
    
    
}
