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

import in.steve.eMart.model.Communicate;
import in.steve.eMart.service.CommunicateService;
@CrossOrigin("*")
@RestController
@RequestMapping("/com")
public class CommunicateController {

	@Autowired
	CommunicateService commService;
	
	@GetMapping("/product")
	public ResponseEntity<List<Communicate>> get(){
		List<Communicate> products  = commService.findAll();
		return new ResponseEntity<List<Communicate>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Communicate> save(@RequestBody Communicate comm){
		Communicate productOne  = commService.save(comm);
		return new ResponseEntity<Communicate>(productOne,HttpStatus.OK);
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Communicate> get(@PathVariable Long id){
		Communicate product  = commService.findById(id);
		return new ResponseEntity<Communicate>(product,HttpStatus.OK);
	}
	
	@DeleteMapping("/product/delete")
	public String delete(){
		commService.delete();
		return "Table is deleted successfully";
	}
	
	@PostMapping("/product/add")
	public ResponseEntity<List<Communicate>> addProducts(@RequestBody List<Communicate> comm){
		List<Communicate> products  = commService.add(comm);
		return new ResponseEntity<List<Communicate>>(products,HttpStatus.OK);
	}
}
