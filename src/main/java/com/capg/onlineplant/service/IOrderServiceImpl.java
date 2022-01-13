package com.capg.onlineplant.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.capg.onlineplant.repository.IOrderRepository;
import com.capg.onlineplant.entity.Order;
/*
* Author :NagaJyothi
* Version : 1.0
* Date : 
* Description : This is Order Service
*/
@Transactional
@Service
public class IOrderServiceImpl implements IOrderService{
	
	@Autowired
	private IOrderRepository orderRepo;
	 /************************************************************************************
	 * Method: viewAllOrder
	 * Description: It is used to view into Order table
	 * @param : Order reference variable.
	 * @returns  It returns Order with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public List<Order> viewAllOrders() {
		return orderRepo.viewAllOrders();
	}
	 /************************************************************************************
	 * Method: view Order
	 * Description: It is used to view into Order table
	 * @param : Order reference variable.
	 * @returns  It returns Order with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Order viewOrder(int orderId) {
		return orderRepo.viewOrder(orderId);
	}

	 /************************************************************************************
		 * Method: addOrder
		 * Description: It is used to add into Order table
		 * @param : Order reference variable.
		 * @returns  It returns Order with details
		 * @Override: It is used to override the Service methods with DAO implementation.
		 * Created By-NagaJyothi
	     * Created Date -
		 * 
		 ************************************************************************************/
	@Override
	public Order addOrder(Order order) {
		Order addorder = new Order();
		addorder.setOrderDate(order.getOrderDate());
		addorder.setPrice(order.getPrice());
		addorder.setQuantity(order.getQuantity());
		addorder.setTransactionMode(order.getTransactionMode());
		return orderRepo.addOrder(order);
	}
	 /************************************************************************************
	 * Method: updateOrder
	 * Description: It is used to update into Order table
	 * @param : Order reference variable.
	 * @returns  It returns Order with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Order updateOrder(Order order) {
			return orderRepo.updateOrder(order);

		}
	 /************************************************************************************
	 * Method: removeOrder
	 * Description: It is used to remove from Order table
	 * @param : Order reference variable.
	 * @returns  It returns Order with details
	 * @Override: It is used to override the Service methods with DAO implementation.
	 * Created By-NagaJyothi
     * Created Date -
	 * 
	 ************************************************************************************/
	@Override
	public Order deleteOrder(int orderId) {
		return orderRepo.deleteOrder(orderId);
	}

}
