package haas.gunther.universal_pet_care.factory;

import org.springframework.stereotype.Component;

import haas.gunther.universal_pet_care.exception.UserAlreadyExistsException;
import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.repository.UserRepository;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SimpleUserFactory implements UserFactory {

    private final UserRepository userRepository;
    private final VeterinarianFactory veterinarianFactory;
    private final PatientFactory patientFactory;
    private final AdminFactory adminFactory;

    @Override
    public User createUser(RegistrationRequest registrationRequest) {
        if (userRepository.existsByEmail(registrationRequest.getEmail())) {
            throw new UserAlreadyExistsException("User with the email " + registrationRequest.getEmail() + "already exists.");
        }        
        return switch (registrationRequest.getUserType()) {
            case "VET" -> veterinarianFactory.createVeterinarian(registrationRequest);
            case "PATIENT" -> patientFactory.createPatient(registrationRequest);
            case "ADMIN" -> adminFactory.createAdmin(registrationRequest);
            default -> null;
        };
    }
    
}
