package in.steve.eMart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.WareProduct;

@Repository	
public interface WareProductRepository extends JpaRepository<WareProduct, Long> {
	
	List<WareProduct> findAllBySid(Integer sid);

}
