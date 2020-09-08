package in.steve.eMart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Pcom;
import in.steve.eMart.repository.PcomRepository;

@Service
public class PcomServiceImpl implements PcomService {
	
	@Autowired
	PcomRepository repository;

	@Override
	public List<Pcom> findAll() {
		return repository.findAll();
	}

	@Override
	public Pcom save(Pcom pcomm) {
		return repository.save(pcomm);
	}

	@Override
	public String delete() {
		repository.deleteAll();
		return "table deleted successfully..!!";
	}

	@Override
	public List<Pcom> add(List<Pcom> pcomm) {
		return repository.saveAll(pcomm);
	}

	@Override
	public List<Pcom> findBySid(Integer sid) {
		// TODO Auto-generated method stub
		return repository.findAllBySid(sid);
	}

}
