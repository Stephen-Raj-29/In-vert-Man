package in.steve.eMart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long> {
	
	Seller findBySname(String sname);

}
