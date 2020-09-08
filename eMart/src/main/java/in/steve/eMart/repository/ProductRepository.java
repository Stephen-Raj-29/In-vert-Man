package in.steve.eMart.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findByName(String name);
}
