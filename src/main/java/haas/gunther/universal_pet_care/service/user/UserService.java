package haas.gunther.universal_pet_care.service.user;

import org.springframework.stereotype.Service;

import haas.gunther.universal_pet_care.factory.UserFactory;
import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.repository.UserRepository;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserFactory userFactory;

    public User add(RegistrationRequest registrationRequest) {
        return userFactory.createUser(registrationRequest);
    }
    
}
