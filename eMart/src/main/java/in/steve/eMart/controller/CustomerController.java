package in.steve.eMart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.model.Customer;
import in.steve.eMart.service.CustomerService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;

	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> get(){
		List<Customer> customer = customerService.findAll();
		return new ResponseEntity<List<Customer>>(customer,HttpStatus.OK);
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> save(@RequestBody Customer customer){
		Customer customerone = customerService.save(customer);
		return new ResponseEntity<Customer>(customerone,HttpStatus.OK);
	}
	
	@GetMapping("/customer/{cid}")
	public ResponseEntity<Customer> get(@PathVariable Long cid){
		Customer customer = customerService.findById(cid);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{cid}")
	public ResponseEntity<String> delete(@PathVariable Long cid){
		if(customerService.delete(cid)=="done")
		{
			return new ResponseEntity<String>("the Customer is deleted Successfully..!!",HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("there is no such Customer..!!",HttpStatus.OK);
		}
	}
}
