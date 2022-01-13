package com.capg.onlineplant.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlineplant.repository.ICustomerRepository;
import com.capg.onlineplant.entity.Customer;

import com.capg.onlineplant.service.ICustomerServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ICustomerServiceTest {
	@InjectMocks
    private ICustomerServiceImpl customerService;
	
	@Mock
	private ICustomerRepository dao;
	
	@Test
	public void addCustomerTest() {
		
		  Customer customer = new Customer(); customer.setCustomerId(2);
		  Mockito.when(dao.addCustomer(customer)).thenReturn(customer);
		  assertEquals(customer, customerService.addCustomer(customer));
		 
	}	

}

