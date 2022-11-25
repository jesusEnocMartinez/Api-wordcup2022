package com.jesusenoc.apimundial.Login;

import lombok.Data;

@Data
public class RegisterUserRequest {
    private String name;
    private String email;
    private String password;
    private String passwordConfirm;
}
