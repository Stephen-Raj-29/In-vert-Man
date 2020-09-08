package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Product;

public interface ProductService {

	List<Product> findAll();
	
	Product save(Product product);
	
	Product findById(Long id);
	
	Product findByName(String name);
	
	String delete(Long id);
	
	Product sub(Product product);
	
	Product add(Product product);
	
	List<Product> addAll(List<Product> product);
	
	List<Product> subAll(List<Product> product);
	
	List<Product> reqAll();
	
}
