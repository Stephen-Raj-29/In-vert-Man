package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Purchase;

public interface PurchaseService {

	List<Purchase> findAll();
	
	Purchase save(Purchase purchase);
	
	List<Purchase> findById(Integer sid);
	
	List<Purchase> addAll(List<Purchase> purchase);
	
	String deleteAll();
}
