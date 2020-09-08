package in.steve.eMart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.steve.eMart.model.Admin;
import in.steve.eMart.service.AdminService;


@CrossOrigin("*")
@RestController
@RequestMapping("user")
public class AdminController {

	@Autowired
	AdminService service;
	
	@GetMapping("/admin")
	public ResponseEntity<List<Admin>> findAll(){
		List<Admin> admins = service.findAll();
		return new ResponseEntity<List<Admin>>(admins,HttpStatus.OK);
	}
	
	@PostMapping("/admin")
	public ResponseEntity<Admin> save(@RequestBody Admin admin){
		Admin admins = service.save(admin);
		return new ResponseEntity<Admin>(admins,HttpStatus.OK);
	}
	
	@PutMapping("/admin")
	public ResponseEntity<Admin> updatePass(@RequestBody Admin admin){
		Admin admins = service.updatePass(admin);
		return new ResponseEntity<Admin>(admins,HttpStatus.OK);
	}
	
	@PostMapping("/admin/login")
	public ResponseEntity<String> checkPass(@RequestBody Admin admin){
		String admins = service.checkPass(admin);
		return new ResponseEntity<String>(admins,HttpStatus.OK);
	}
}
