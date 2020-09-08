package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Order;

public interface OrderService {
	
		
	List<Order> findAll();
	
	Order save(Order order);
	
	List<Order> saveAll(List<Order> orders);
}
