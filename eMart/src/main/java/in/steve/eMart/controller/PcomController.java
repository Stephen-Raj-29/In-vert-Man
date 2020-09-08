package in.steve.eMart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.model.Pcom;
import in.steve.eMart.service.PcomService;

@RestController
@RequestMapping("/pcom")
public class PcomController {

	@Autowired
	PcomService service;
	
	@GetMapping("/product")
	public ResponseEntity<List<Pcom>> get(){
		List<Pcom> products  =service.findAll();
		return new ResponseEntity<List<Pcom>>(products,HttpStatus.OK);
	}
	
	@PostMapping("/product")
	public ResponseEntity<Pcom> save(@RequestBody Pcom pcom){
		Pcom productOne  = service.save(pcom);
		return new ResponseEntity<Pcom>(productOne,HttpStatus.OK);
	}
	
	@GetMapping("/product/{sid}")
	public ResponseEntity<List<Pcom>> get(@PathVariable Integer sid){
		List<Pcom> product  = service.findBySid(sid);
		return new ResponseEntity<List<Pcom>>(product,HttpStatus.OK);
	}
	
	@PostMapping("/product/add")
	public ResponseEntity<List<Pcom>> get(@RequestBody List<Pcom> pcomm){
		List<Pcom> product  = service.add(pcomm);
		return new ResponseEntity<List<Pcom>>(product,HttpStatus.OK);
	}
	
	@DeleteMapping("/product")
	public ResponseEntity<String> delete(){
		String product  = service.delete();
		return new ResponseEntity<String>(product,HttpStatus.OK);
	}
}
