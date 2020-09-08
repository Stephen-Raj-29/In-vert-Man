package in.steve.eMart.service;

import java.util.List;

import in.steve.eMart.model.Communicate;

public interface CommunicateService {
	
	List<Communicate> findAll();
	
	Communicate save(Communicate comm);
	
	Communicate findById(Long id);
	
	String delete();

	List<Communicate> add(List<Communicate> comm);
}
