package in.steve.eMart.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Purchase;
import in.steve.eMart.repository.PurchaseRepository;

@Service
public class PurchaseServiceImpl implements PurchaseService {

	@Autowired
	PurchaseRepository pRepository;
	@Override
	public List<Purchase> findAll() {
		return pRepository.findAll();
	}

	@Override
	public Purchase save(Purchase purchase) {
		return pRepository.save(purchase);
	}

	@Override
	public	 List<Purchase> findById(Integer sid) {
		List<Purchase> pur =pRepository.findAll();
		List<Purchase> res = new ArrayList<Purchase>();
		for(Purchase purs:pur) {
			if(purs.getId()==sid)
			{
				Purchase f = purs;
				System.out.print(f.getName());
				res.add(f);
			}
		}
		return res;
	}

	@Override
	public List<Purchase> addAll(List<Purchase> purchase) {
		
		return pRepository.saveAll(purchase);
	}

	@Override
	public String deleteAll() {
		pRepository.deleteAll();
		return "Deleted table successfully..!!";
	}	
}
