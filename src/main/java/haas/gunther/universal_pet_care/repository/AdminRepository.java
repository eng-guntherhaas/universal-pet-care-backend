package haas.gunther.universal_pet_care.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import haas.gunther.universal_pet_care.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
    
}
