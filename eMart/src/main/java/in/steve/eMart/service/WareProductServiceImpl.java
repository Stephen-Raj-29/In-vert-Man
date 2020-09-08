package in.steve.eMart.service;

import java.util.ArrayList;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import in.steve.eMart.model.WareProduct;
import in.steve.eMart.repository.WareProductRepository;

@Service
public class WareProductServiceImpl implements WareProductService {

	@Autowired
	WareProductRepository wareproductRepository;
	
	@Override
	public List<WareProduct> findAll() {
		return wareproductRepository.findAll();
	}

	@Override
	public WareProduct save(WareProduct wareproduct) {
		wareproductRepository.save(wareproduct);
		return wareproduct;
	}

	@Override
	public WareProduct findById(Long id) {
		if(wareproductRepository.findById(id).isPresent())
			return wareproductRepository.findById(id).get();
		return null;
	}

	@Override
	public String delete(Long id) {
		if(wareproductRepository.findById(id).isPresent())
		{
			WareProduct wareproduct = findById(id);
			wareproductRepository.delete(wareproduct);
			return "done";
		}
		return "fail";
	}

	@Override
	public List<WareProduct> update(List<WareProduct> wareproduct) {
		List<WareProduct> newpro = new ArrayList<WareProduct>();
		for(WareProduct products: wareproduct)
		{
			WareProduct existingProduct = wareproductRepository.findById(products.getId()).orElse(null);
			existingProduct.setQuantity(existingProduct.getQuantity()-products.getQuantity());
			newpro.add(existingProduct);
		}
		return wareproductRepository.saveAll(newpro);
	}
	
	@Override
	public List<WareProduct> add(List<WareProduct> wareproduct) {
		return wareproductRepository.saveAll(wareproduct);
	}

	@Override
	public List<WareProduct> reqAll() {
		List<WareProduct> req = wareproductRepository.findAll();
		List<WareProduct> res = new ArrayList<WareProduct>();
		
		for(WareProduct products: req)
		{
			WareProduct existingProduct = wareproductRepository.findById(products.getId()).orElse(null);
			if(existingProduct.getQuantity()<=10)
			{
				res.add(existingProduct);
			}
		}
		return res;
	}

	@Override
	public List<WareProduct> findBySid(Integer sid) {
		return wareproductRepository.findAllBySid(sid);
	}
}
