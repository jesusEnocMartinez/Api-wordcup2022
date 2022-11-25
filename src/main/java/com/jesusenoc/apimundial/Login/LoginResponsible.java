package com.jesusenoc.apimundial.Login;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class LoginResponsible {

    private String status;
    @JsonProperty("data")
    private RegisterDataUser registeredDataUser;
}
