package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Admin;

public interface AdminService {

	List<Admin> findAll();
	
	Admin save(Admin admin);
	
	Admin updatePass(Admin admin);
	
	String checkPass(Admin admin);
}
