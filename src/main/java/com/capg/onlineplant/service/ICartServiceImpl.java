package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlineplant.repository.ICartRepository;
import com.capg.onlineplant.entity.Cart;
/*
 * Author : Hemanth
 * Version : 1.0
 * Date : 28-11-2021
 * Description : This is Cart Service
*/
@Transactional
@Service
public class ICartServiceImpl implements ICartService{
	@Autowired
	   ICartRepository deo;

	 /************************************************************************************
		 * Method: addCart
		 * Description: It is used to add into Cart table
		 * @param : Carts reference variable.
		 * @returns  It returns cart with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-Hemanth
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Cart addCart(Cart cart) {
		return deo.addCart(cart);
	}
	 /************************************************************************************
	 * Method: updateCart
	 * Description: It is used to update into Cart table
	 * @param : Carts reference variable.
	 * @returns  It returns cart with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Hemanth
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Cart updateCart(Cart cart) {
		return deo.updateCart(cart);
	}
	 /************************************************************************************
	 * Method: removeCart
	 * Description: It is used to remove from Cart table
	 * @param : Carts reference variable.
	 * @returns  It returns cart with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Hemanth
     * Created Date -

	 * 
	 ************************************************************************************/
	@Override
	public Cart removeCart(Cart cart) {
		return deo.removeCart(cart);
	}
	 /************************************************************************************
	 * Method: viewAllCart
	 * Description: It is used to view into Cart table
	 * @param : Carts reference variable.
	 * @returns  It returns cart with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Hemanth
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public List<Cart> viewAllCarts(){
		return deo.viewAllCarts();
		}

}
