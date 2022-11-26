package com.jesusenoc.apimundial.Service;

import com.jesusenoc.apimundial.Login.LoginRequest;
import com.jesusenoc.apimundial.Login.LoginResponsible;
import com.jesusenoc.apimundial.Login.RegisterUserRequest;
import com.jesusenoc.apimundial.Login.RegisterUserResponsible;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class UserServiceIml  extends AbstracCliente implements UserService{
    public UserServiceIml(RestTemplate restTemplate) {
        super(restTemplate);
    }
    @Override
    public RegisterUserResponsible create(RegisterUserRequest user) {
        String uri = baseUrl + "/user";
        log.info("Going to create {}", user);
        ResponseEntity<RegisterUserResponsible> response = restTemplate.postForEntity(uri, user, RegisterUserResponsible.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }

    @Override
    public LoginResponsible login(LoginRequest loginRequest) {

        String uri = baseUrl + "/user/login";
        log.info("Going to login {}", loginRequest);
        ResponseEntity<LoginResponsible> response = restTemplate.postForEntity(uri, loginRequest, LoginResponsible.class);
        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user login - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
}
