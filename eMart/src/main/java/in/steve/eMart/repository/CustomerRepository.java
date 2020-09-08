package in.steve.eMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}
