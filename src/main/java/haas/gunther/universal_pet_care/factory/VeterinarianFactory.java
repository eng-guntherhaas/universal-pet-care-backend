package haas.gunther.universal_pet_care.factory;

import org.springframework.stereotype.Service;

import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.model.Veterinarian;
import haas.gunther.universal_pet_care.repository.VeterinarianRepository;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import haas.gunther.universal_pet_care.service.user.UserAttributeMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class VeterinarianFactory {

    private final VeterinarianRepository veterinarianRepository;
    private final UserAttributeMapper userAttributeMapper;
    

    public User createVeterinarian(RegistrationRequest registrationRequest) {
        Veterinarian veterinarian = new Veterinarian();
        userAttributeMapper.setCommonAttributes(registrationRequest, veterinarian);
        veterinarian.setSpecialization(registrationRequest.getSpecialization());
        return veterinarianRepository.save(veterinarian);
    }
    
}
