package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Seller;

public interface SellerService {

	List<Seller> findAll();
	
	Seller save(Seller seller);
	
	Seller findById(Long sid);
	
	String delete(Long sid);
	
	String checkPass(Seller seller);
}
