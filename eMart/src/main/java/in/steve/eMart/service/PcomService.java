package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Pcom;

public interface PcomService {

	List<Pcom> findAll();
	
	Pcom save(Pcom pcomm);
	
	String delete();

	List<Pcom> add(List<Pcom> pcomm);
	
	List<Pcom> findBySid(Integer sid);
	
}
