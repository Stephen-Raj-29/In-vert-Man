package in.steve.eMart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Communicate;
import in.steve.eMart.repository.CommunicateRepository;

@Service
public class CommunicateServiceImpl implements CommunicateService {

	@Autowired
	CommunicateRepository comRepository;

	@Override
	public List<Communicate> findAll() {
		return comRepository.findAll();
	}

	@Override
	public Communicate save(Communicate comm) {
		comRepository.save(comm);
		return comm;
	}

	@Override
	public Communicate findById(Long id) {
		if(comRepository.findById(id).isPresent()) {
			return comRepository.findById(id).get();
		}
		return null;
	}

	@Override
	public String delete() {
		comRepository.deleteAll();
		return "Deleted successfully";
	}

	@Override
	public List<Communicate> add(List<Communicate> comm) {
		return comRepository.saveAll(comm);
	}	
}
