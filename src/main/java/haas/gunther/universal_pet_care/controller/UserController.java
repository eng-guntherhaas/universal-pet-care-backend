package haas.gunther.universal_pet_care.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import haas.gunther.universal_pet_care.dto.EntityConverter;
import haas.gunther.universal_pet_care.dto.UserDto;
import haas.gunther.universal_pet_care.exception.UserAlreadyExistsException;
import haas.gunther.universal_pet_care.model.User;
import haas.gunther.universal_pet_care.request.RegistrationRequest;
import haas.gunther.universal_pet_care.service.user.UserService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("/users")
@RestController
public class UserController {
    
    private final UserService userService;
    private final EntityConverter<User, UserDto> entityConverter;

    @PostMapping

    public ResponseEntity<ApiResponse> addUser(@RequestBody RegistrationRequest registrationRequest) {
        try {
            User theUser = userService.add(registrationRequest);
            UserDto registeredUser = entityConverter.mapEntityToDto(theUser, UserDto.class);
            return ResponseEntity.ok(new ApiResponse("User created successfully", registeredUser));

        } catch (UserAlreadyExistsException e) {
            return ResponseEntity.ok(new ApiResponse(e.getMessage(), null));
        }
    }
    
}
