package com.jesusenoc.apimundial.Dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.jesusenoc.apimundial.Model.Team;
import lombok.Data;

import java.util.List;

@Data
public class TeamResponse {
    public String status;

    @JsonProperty("data")
    public List<Team> teams;
}
