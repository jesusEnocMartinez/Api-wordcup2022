package com.jesusenoc.apimundial.Login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RegisterUserResponsible {

    private String status;
    private String message;
    @JsonProperty("data")
    private RegisterDataUser registeredDataUser;

}
