package com.capg.onlineplant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Cart;

@Repository
public interface ICartRepository {
	
		Cart addCart(Cart cart);
		Cart updateCart(Cart cart);
		Cart removeCart(Cart cart);
		List<Cart> viewAllCarts();

}
