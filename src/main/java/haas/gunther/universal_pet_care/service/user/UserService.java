package haas.gunther.universal_pet_care.service.user;

import org.springframework.stereotype.Service;

import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void add(User user) {
        userRepository.save(user);
    }
    
}
