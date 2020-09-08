package in.steve.eMart.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.steve.eMart.model.Admin;
import in.steve.eMart.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService {

	@Autowired
	AdminRepository repository;

	@Override
	public List<Admin> findAll(){
		return repository.findAll();
	}

	@Override
	public Admin save(Admin admin) {
		return repository.save(admin);
	}

	@Override
	public Admin updatePass(Admin admin) {
		if(repository.findById(admin.getAname()).isPresent()) {
			Admin ad = repository.findById(admin.getAname()).orElse(null);
			ad.setPassword(admin.getPassword());
			return repository.save(ad);
		}
		return null;
	}

	@Override
	public String checkPass(Admin admin)
	{
		if(repository.findById(admin.getAname()).isPresent())
		{
			Admin ad = repository.findById(admin.getAname()).orElse(null);
				if(ad.getPassword().equals(admin.getPassword())) 
				{
					return ad.getType();
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
