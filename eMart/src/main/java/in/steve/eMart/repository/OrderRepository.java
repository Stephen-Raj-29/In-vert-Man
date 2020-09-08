package in.steve.eMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long>{

}
