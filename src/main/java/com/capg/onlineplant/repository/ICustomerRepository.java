package com.capg.onlineplant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Customer;



@Repository
public interface ICustomerRepository {
	   List<Customer> viewAllCustomers();
	   Customer viewCustomer(int customerId);
		
	    Customer validateCustomer(String username,String password);
		Customer addCustomer(Customer customer);
		Customer updateCustomer(Customer customer);
		Customer removeCustomer(Customer customer);

}
