package haas.gunther.universal_pet_care.factory;

import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.request.RegistrationRequest;

public interface UserFactory {

    public User createUser(RegistrationRequest registrationRequest);
    
}
