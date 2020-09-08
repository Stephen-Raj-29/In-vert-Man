package in.steve.eMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Communicate;

@Repository
public interface CommunicateRepository extends JpaRepository<Communicate, Long> {

}
