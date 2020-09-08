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

import in.steve.eMart.model.Seller;
import in.steve.eMart.service.SellerService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class SellerController {

	@Autowired
	SellerService sService;
	
	@GetMapping("/seller")
	public ResponseEntity<List<Seller>> get()
	{
		List<Seller> seller = sService.findAll();
		return new ResponseEntity<List<Seller>>(seller,HttpStatus.OK);
				
	}
	
	@PostMapping("/seller")
	public ResponseEntity<Seller> save(@RequestBody Seller seller){
		Seller sellerOne  = sService.save(seller);
		return new ResponseEntity<Seller>(sellerOne,HttpStatus.OK);
	}
	
	@GetMapping("/seller/{sid}")
	public ResponseEntity<Seller> get(@PathVariable Long sid){
		Seller seller  = sService.findById(sid);
		return new ResponseEntity<Seller>(seller,HttpStatus.OK);
	}
	
	@DeleteMapping("/seller/{sid}")
	public ResponseEntity<String> delete(@PathVariable Long sid){
		if(sService.delete(sid)=="done")
		{
		return new ResponseEntity<String>("the Seller is deleted successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("there is no such Seller",HttpStatus.OK);
		}
	}
	
	@PostMapping("/seller/login")
	public ResponseEntity<String> checkPass(@RequestBody Seller seller)
	{
		String login = sService.checkPass(seller);
		return new ResponseEntity<String>(login,HttpStatus.OK);
	}
	
	
}
