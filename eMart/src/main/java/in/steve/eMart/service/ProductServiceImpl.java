package in.steve.eMart.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Product;
import in.steve.eMart.repository.ProductRepository;

@Service		
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<Product> findAll() {
		
		return productRepository.findAll();
	}

	@Override
	public Product save(Product product) {
		productRepository.save(product);
		return product;
	}

	@Override
	public Product findById(Long id) {
		if(productRepository.findById(id).isPresent()) {
			return productRepository.findById(id).get();
		}			
		return null;
	}

	@Override
	public String delete(Long id) {
		if(productRepository.findById(id).isPresent())
		{
			Product product = findById(id);
			productRepository.delete(product);
			return "done";
		}
		return "fail";
	}

	@Override
	public Product add(Product product) 
	{
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setQuantity(existingProduct.getQuantity()+product.getQuantity());
		return productRepository.save(existingProduct);
	}
	
	
	@Override
	public Product sub(Product product) {
		Product existingProduct = productRepository.findById(product.getId()).orElse(null);
		existingProduct.setQuantity(existingProduct.getQuantity()-product.getQuantity());
		return productRepository.save(existingProduct);
	}

	@Override
	public List<Product> addAll(List<Product> product) {
		List<Product> newPro = new ArrayList<Product>();
		for(Product products: product) 
		{ 
			Product existingProduct = productRepository.findById(products.getId()).orElse(null);
			existingProduct.setQuantity(existingProduct.getQuantity()+products.getQuantity());
			newPro.add(existingProduct);
		}
		return productRepository.saveAll(newPro);
	}

	@Override
	public List<Product> subAll(List<Product> product) {
		List<Product> newPro = new ArrayList<Product>();
		for(Product products: product) 
		{ 
			Product existingProduct = productRepository.findById(products.getId()).orElse(null);
			existingProduct.setQuantity(existingProduct.getQuantity()-products.getQuantity());
			newPro.add(existingProduct);
		}
		return productRepository.saveAll(newPro);
	}

	@Override
	public List<Product> reqAll() {
		List<Product> req = productRepository.findAll();
		List<Product> res = new ArrayList<Product>();
		
		for(Product products: req)
		{
			Product existingProduct = productRepository.findById(products.getId()).orElse(null);
			if(existingProduct.getQuantity()<=10)
			{
				res.add(existingProduct);
			}
		}
		return res;
	}

	@Override
	public Product findByName(String name) {
		return productRepository.findByName(name);
	}
	
}
