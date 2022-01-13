package com.capg.onlineplant.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.capg.onlineplant.entity.Order;

@Repository
public interface IOrderRepository {

	List<Order> viewAllOrders();
	Order viewOrder(int orderId);
	Order addOrder(Order order);
	Order updateOrder(Order order);
	Order deleteOrder(int orderId);
}