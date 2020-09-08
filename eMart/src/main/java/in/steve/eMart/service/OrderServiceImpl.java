package in.steve.eMart.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Order;
import in.steve.eMart.repository.OrderRepository;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;

	@Override
	public List<Order> findAll() {
		return orderRepository.findAll();
	}

	@Override
	public Order save(Order order) {
		
		return orderRepository.save(order);
	}

	@Override
	public List<Order> saveAll(List<Order> orders) {
		
		return orderRepository.saveAll(orders);
	}

//	
//	@Override
//	public Order add(Order order) {
//		Order existingOrder = orderRepository.findById(order.getCid()).orElse(null);
//		existingOrder.setQuantity(existingOrder.getQuantity()+order.getQuantity());
//		existingOrder.setPrice(existingOrder.getPrice()+order.getPrice());
//		return orderRepository.save(existingOrder);
//	}
//
//	@Override
//	public List<Order> addAll(List<Order> order) {
//		List<Order> newPro = new ArrayList<Order>();
//		for(Order orders: order) 
//		{ 
//			if(orderRepository.findById(orders.getCid()).isPresent())
//			{
//				Order existingOrder = orderRepository.findById(orders.getCid()).orElse(null);
//				if(existingOrder.getId()==(orders.getId()))
//				{
//					existingOrder.setQuantity(existingOrder.getQuantity()+orders.getQuantity());
//					existingOrder.setPrice(existingOrder.getPrice()+orders.getPrice());
//					newPro.add(existingOrder);
//				}
//				else
//				{
//					orderRepository.save(orders);
//				}
//				
//			}
//			else
//			{
//				;
//			}
//		}
//		return null;
//	}

}
