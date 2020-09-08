package in.steve.eMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Purchase;

@Repository
public interface PurchaseRepository extends JpaRepository<Purchase, Integer> {

}
