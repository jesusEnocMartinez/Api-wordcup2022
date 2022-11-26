package com.jesusenoc.apimundial.Controller;

import com.jesusenoc.apimundial.Login.LoginRequest;
import com.jesusenoc.apimundial.Login.LoginResponsible;
import com.jesusenoc.apimundial.Login.RegisterUserRequest;
import com.jesusenoc.apimundial.Login.RegisterUserResponsible;
import com.jesusenoc.apimundial.Service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("worldcup/users")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public RegisterUserResponsible registerUser(@RequestBody RegisterUserRequest registerUserRequest) {
        return this.userService.create(registerUserRequest);
    }

    @PostMapping("/login")
    public LoginResponsible login(@RequestBody LoginRequest loginRequest) {
        return this.userService.login(loginRequest);
    }
}
