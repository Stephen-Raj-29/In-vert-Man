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
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.model.Purchase;
import in.steve.eMart.service.PurchaseService;
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class PurchaseController {

	@Autowired
	PurchaseService pService;
	
	@GetMapping("/purchase")
	public ResponseEntity<List<Purchase>> get()
	{
		List<Purchase> purchase = pService.findAll();
		return new ResponseEntity<List<Purchase>>(purchase,HttpStatus.OK);
				
	}
	
	@PostMapping("/purchase")
	public ResponseEntity<Purchase> save(@RequestBody Purchase purchase){
		Purchase purchaseOne  = pService.save(purchase);
		return new ResponseEntity<Purchase>(purchaseOne,HttpStatus.OK);
	}
	
	@GetMapping("/purchase/{sid}")
	public ResponseEntity<List<Purchase>> get(@PathVariable Integer sid){
		List<Purchase> purchase  = pService.findById(sid);
		return new ResponseEntity<List<Purchase>>(purchase,HttpStatus.OK);
	}
	
	@PutMapping("/purchase/add")
	public ResponseEntity<List<Purchase>> addProducts(@RequestBody List<Purchase> purchase){
		List<Purchase> purchases  = pService.addAll(purchase);
		return new ResponseEntity<List<Purchase>>(purchases,HttpStatus.OK);
	}
	
	@DeleteMapping("/purchase/delete")
	public String deleteAll() {
		pService.deleteAll();
		return "Delete table successfully..!!";
	}
}
