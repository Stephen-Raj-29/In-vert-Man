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

import in.steve.eMart.model.Product;
import in.steve.eMart.service.ProductService;


@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class ProductController {
	
	@Autowired
	ProductService productService;

	@GetMapping("/product")
	public ResponseEntity<List<Product>> get(){
		List<Product> products  = productService.findAll();
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Product> save(@RequestBody Product product){
		Product productOne  = productService.save(product);
		return new ResponseEntity<Product>(productOne,HttpStatus.OK);
	}
	
	@GetMapping("/product/id/{id}")
	public ResponseEntity<Product> get(@PathVariable Long id){
		Product product  = productService.findById(id);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@GetMapping("/product/name/{name}")
	public ResponseEntity<Product> getByName(@PathVariable String name){
		Product product  = productService.findByName(name);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
	
	@GetMapping("/product/low")
	public ResponseEntity<List<Product>> req(){
		List<Product> product  = productService.reqAll();
		return new ResponseEntity<List<Product>>(product,HttpStatus.OK);
	}
	
	@DeleteMapping("/product/{id}")
	public ResponseEntity<String> delete(@PathVariable Long id){
		if(productService.delete(id)=="done")
		{
		return new ResponseEntity<String>("the product is deleted successfully..!!",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("there is no such Product",HttpStatus.OK);
		}
	}

	@PostMapping("/product/add")
	public ResponseEntity<Product> add(@RequestBody Product product){
		Product products  = productService.add(product);
		return new ResponseEntity<Product>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product/sub")
	public ResponseEntity<Product> sub(@RequestBody Product product){
		Product productOne  = productService.sub(product);
		return new ResponseEntity<Product>(productOne,HttpStatus.OK);
	}
	
	@PostMapping("/product/addAll")
	public ResponseEntity<List<Product>> addAll(@RequestBody List<Product> product){
		List<Product> products  = productService.addAll(product);
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product/subAll")
	public ResponseEntity<List<Product>> subAll(@RequestBody List<Product> product){
		List<Product> products  = productService.subAll(product);
		return new ResponseEntity<List<Product>>(products,HttpStatus.OK);
	}
	
	
	
}
