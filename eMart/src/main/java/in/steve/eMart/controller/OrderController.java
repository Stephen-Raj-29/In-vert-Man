package in.steve.eMart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.model.Order;
import in.steve.eMart.service.OrderService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class OrderController {

	@Autowired
	OrderService orderService;
	
	@PostMapping("/order")
	public ResponseEntity<Order> save(@RequestBody Order order){
		Order orders = orderService.save(order);
		return new ResponseEntity<Order>(orders,HttpStatus.OK);
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<Order>> get(){
		List<Order> orders = orderService.findAll();
		return new ResponseEntity<List<Order>>(orders,HttpStatus.OK);
	}
	
	@PostMapping("/order/addAll")
	public ResponseEntity<List<Order>> addAll(@RequestBody List<Order> order){
		List<Order> orders  = orderService.saveAll(order);
		return new ResponseEntity<List<Order>>(orders,HttpStatus.OK);
	}
}
