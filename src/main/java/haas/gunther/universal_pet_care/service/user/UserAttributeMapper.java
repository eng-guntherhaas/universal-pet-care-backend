package haas.gunther.universal_pet_care.service.user;

import org.springframework.stereotype.Component;

import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.request.RegistrationRequest;

@Component
public class UserAttributeMapper {

    public void setCommonAttributes(RegistrationRequest source, User target) {
        target.setFirstName(source.getFirstName());
        target.setLastName(source.getLastName());
        target.setGender(source.getGender());
        target.setPhoneNumber(source.getPhoneNumber());
        target.setEmail(source.getEmail());
        target.setPassword(source.getPassword());
        target.setUserType(source.getUserType());
        target.setEnabled(source.isEnabled());
    }
    
}

