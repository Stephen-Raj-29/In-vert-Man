package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Customer;

public interface CustomerService {
	
	List<Customer> findAll();
	
	Customer save(Customer customer);
	
	Customer findById(Long cid);
	
	String delete(Long cid);

}
