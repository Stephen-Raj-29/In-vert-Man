package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.WareProduct;

public interface WareProductService {

	List<WareProduct> findAll();
	
	WareProduct save(WareProduct wareproduct);
	
	WareProduct findById(Long id);
	
	String delete(Long id);
	
	List<WareProduct> update(List<WareProduct> wareproduct);
	
	List<WareProduct> add(List<WareProduct> wareproduct);
	
	List<WareProduct> reqAll();
	
	List<WareProduct> findBySid(Integer sid);
}
