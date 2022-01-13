package com.capg.onlineplant.service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import java.util.Optional;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.capg.onlineplant.repository.ICartRepository;
import com.capg.onlineplant.repository.IOrderRepository;
import com.capg.onlineplant.entity.Cart;
import com.capg.onlineplant.entity.Order;
import com.capg.onlineplant.service.IOrderServiceImpl;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IOrderServiceTest {
	@InjectMocks
    private IOrderServiceImpl orderService;
	@Mock
	private IOrderRepository orderRepo;
	
	@Test
	public void addOrderTest() {
		Order order = new Order();
		order.setBookingOrderId(1);
		when(orderRepo.addOrder(order)).thenReturn(order);
		assertEquals(order, orderService.addOrder(order));
	}
	
}
