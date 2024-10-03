package haas.gunther.universal_pet_care.factory;

import org.springframework.stereotype.Service;

import haas.gunther.universal_pet_care.model.Admin;
import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.repository.AdminRepository;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import haas.gunther.universal_pet_care.service.user.UserAttributeMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminFactory {

    private final AdminRepository adminRepository;
    private final UserAttributeMapper userAttributeMapper;

    public User createAdmin(RegistrationRequest registrationRequest) {
        Admin admin = new Admin();
        userAttributeMapper.setCommonAttributes(registrationRequest, admin);
        return adminRepository.save(admin);
    }
    
}
