package haas.gunther.universal_pet_care.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import haas.gunther.universal_pet_care.model.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    
}
