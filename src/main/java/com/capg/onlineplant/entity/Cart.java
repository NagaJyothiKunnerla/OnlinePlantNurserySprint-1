package com.capg.onlineplant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
	
	@Id
	@GeneratedValue
	private int cartId;
	private double price;
	
	public Cart(int cartId, double price) {
		super();
		this.cartId = cartId;
		this.price = price;
	}



	
	public Cart() {
		// TODO Auto-generated constructor stub
	}




	public void setCartId(int i) {
		// TODO Auto-generated method stub
		
	}
}


