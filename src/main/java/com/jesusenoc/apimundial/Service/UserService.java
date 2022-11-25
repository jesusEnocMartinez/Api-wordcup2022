package com.jesusenoc.apimundial.Service;


import com.jesusenoc.apimundial.Login.LoginRequest;
import com.jesusenoc.apimundial.Login.LoginResponsible;
import com.jesusenoc.apimundial.Login.RegisterUserRequest;
import com.jesusenoc.apimundial.Login.RegisterUserResponsible;

public interface UserService {
    RegisterUserResponsible create(RegisterUserRequest user);
    LoginResponsible login(LoginRequest loginRequest);

}
