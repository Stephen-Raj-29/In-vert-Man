package in.steve.eMart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Seller;
import in.steve.eMart.repository.SellerRepository;

@Service
public class SellerServiceImpl implements SellerService {

	@Autowired
	SellerRepository sRepository;
	
	@Override
	public List<Seller> findAll() {
		return sRepository.findAll();
	}

	@Override
	public Seller save(Seller seller) {
		sRepository.save(seller);
		return seller;
	}

	@Override
	public Seller findById(Long sid) {
		if(sRepository.findById(sid).isPresent())
			return sRepository.findById(sid).get();
		return null;
	}

	@Override
	public String delete(Long sid) {
		if(sRepository.findById(sid).isPresent())
		{
			Seller seller = findById(sid);
			sRepository.delete(seller);
			return "done";
		}
		return "fail";
	}

	@Override
	public String checkPass(Seller seller) 
	{
//		if(sRepository.findBySname(seller.getSname()).isPresent())
		Seller se =sRepository.findBySname(seller.getSname());
		if(se!=null) {
			
		if(se.getEmail().equals(seller.getEmail()) ||se.getSname().equals(seller.getSname()))
		{
			if(se.getPassword().equals(seller.getPassword()))
			{
				return se.getSname();
			}
			else
			{
				return null;
			}
		}
		else
		{
			return null;
		}
		}
		else
		{
			return null;
		}
	}

}
