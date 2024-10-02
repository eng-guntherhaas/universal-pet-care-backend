package haas.gunther.universal_pet_care.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.service.user.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {
    private final UserService userService;

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.add(user);
    }
    
}
