package in.steve.eMart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.steve.eMart.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, String> {

}
