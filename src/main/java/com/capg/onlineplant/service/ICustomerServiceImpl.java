package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.onlineplant.repository.ICustomerRepository;
import com.capg.onlineplant.entity.Customer;
/*
 * Author :Vamsi krishna
 * Version : 1.0
 * Date : 
 * Description : This is Customer Service
*/
@Transactional
@Service
public class ICustomerServiceImpl implements ICustomerService {

@Autowired
   ICustomerRepository dao;

/************************************************************************************
	 * Method: addCustomer
	 * Description: It is used to add into Customer table
	 * @param : Customer reference variable.
	 * @returns  It returns Customer with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Vamsi krishna
    * Created Date -
	 * 
	 ************************************************************************************/
public Customer addCustomer(Customer customer) {
return dao.addCustomer(customer);
}
/************************************************************************************
	 * Method: updateCustomer
	 * Description: It is used to update into Customer table
	 * @param : Customer reference variable.
	 * @returns  It returns Customer with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Vamsi krishna
    * Created Date -
	 * 
	 ************************************************************************************/
public Customer updateCustomer(Customer customer)
{
	return dao.updateCustomer(customer);
}
/************************************************************************************
	 * Method: removeCustomer
	 * Description: It is used to remove from Customer table
	 * @param : Customer reference variable.
	 * @returns  It returns Customer with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Vamsi krishna
    * Created Date -
	 * 
	 ************************************************************************************/
public Customer removeCustomer(Customer customer) {
	return dao.removeCustomer(customer);
}
/************************************************************************************
	 * Method: viewAllCustomer
	 * Description: It is used to view into Customer table
	 * @param : Customer reference variable.
	 * @returns  It returns Customer with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Vamsi krishna
    * Created Date -
	 * 
	 ************************************************************************************/
public List<Customer> viewAllCustomers(){
return dao.viewAllCustomers();
}
/************************************************************************************
	 * Method: view Customer
	 * Description: It is used to view into Customer table
	 * @param : Customer reference variable.
	 * @returns  It returns Customer with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-Vamsi krishna
    * Created Date -
	 * 
	 ************************************************************************************/
public Customer viewCustomer(int customerId) {
	return dao.viewCustomer(customerId);
}
public Customer validateCustomer(String username,String password)
{
	return dao.validateCustomer(username,password);
}
}
