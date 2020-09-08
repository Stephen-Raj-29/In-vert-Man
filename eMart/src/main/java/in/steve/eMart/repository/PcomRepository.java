package in.steve.eMart.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Pcom;

@Repository
public interface PcomRepository extends JpaRepository<Pcom, Long> {
	
	List<Pcom> findAllBySid(Integer sid);

}
