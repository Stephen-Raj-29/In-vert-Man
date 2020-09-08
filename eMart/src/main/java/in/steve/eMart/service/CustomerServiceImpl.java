package in.steve.eMart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Customer;
import in.steve.eMart.repository.CustomerRepository;

@Service	
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	@Override
	public List<Customer> findAll() {
		
		return customerRepository.findAll();
	}

	@Override
	public Customer save(Customer customer) {
		customerRepository.save(customer);
		return customer;
	}

	@Override
	public Customer findById(Long cid) {
		if(customerRepository.findById(cid).isPresent()) {
			return customerRepository.findById(cid).get();
		}
		return null;
	}

	@Override
	public String delete(Long cid) {
		if(customerRepository.findById(cid).isPresent())
		{
			Customer customer = findById(cid);
			customerRepository.delete(customer);
			return "done";
		}
		return "fail";
	}

}
