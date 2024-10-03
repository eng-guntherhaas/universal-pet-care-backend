package haas.gunther.universal_pet_care.factory;

import org.springframework.stereotype.Service;

import haas.gunther.universal_pet_care.model.Patient;
import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.repository.PatientRepository;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import haas.gunther.universal_pet_care.service.user.UserAttributeMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PatientFactory {

    private final PatientRepository patientRepository;
    private final UserAttributeMapper userAttributeMapper;

    public User createPatient(RegistrationRequest registrationRequest) {
        Patient patient = new Patient();
        userAttributeMapper.setCommonAttributes(registrationRequest, patient);
        return patientRepository.save(patient);
    }
    
}
