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

import in.steve.eMart.model.WareProduct;
import in.steve.eMart.service.WareProductService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class WareProductController {

	@Autowired
	WareProductService service;
	
	@GetMapping("/wproduct")
	public ResponseEntity<List<WareProduct>> get(){
		List<WareProduct> products  = service.findAll();
		return new ResponseEntity<List<WareProduct>>(products,HttpStatus.OK);
	}
	
	@GetMapping("/wproduct/low")
	public ResponseEntity<List<WareProduct>> req(){
		List<WareProduct> products  = service.reqAll();
		return new ResponseEntity<List<WareProduct>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/wproduct")
	public ResponseEntity<WareProduct> save(@RequestBody WareProduct wareproduct){
		WareProduct productOne  = service.save(wareproduct);
		return new ResponseEntity<WareProduct>(productOne,HttpStatus.OK);
	}
	
	@GetMapping("/wproduct/{id}")
	public ResponseEntity<WareProduct> get(@PathVariable Long id){
		WareProduct product  = service.findById(id);
		return new ResponseEntity<WareProduct>(product,HttpStatus.OK);
	}
	
	@DeleteMapping("/wproduct/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		if(service.delete(id)=="done")
		{
		return new ResponseEntity<String>("the product is deleted successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("there is no such Product",HttpStatus.OK);
		}
	}
	
	@PostMapping("/wproduct/sub")
	public ResponseEntity<List<WareProduct>> subAllProducts(@RequestBody List<WareProduct> wareproduct){
		List<WareProduct> products  = service.update(wareproduct);
		return new ResponseEntity<List<WareProduct>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/wproduct/add")
	public ResponseEntity<List<WareProduct>> addProducts(@RequestBody List<WareProduct> wareproduct){
		List<WareProduct> wareproducts  = service.add(wareproduct);
		return new ResponseEntity<List<WareProduct>>(wareproducts,HttpStatus.OK);
	}
	
}
