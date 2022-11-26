package com.jesusenoc.apimundial.Service;

import com.jesusenoc.apimundial.Dto.TeamResponse;

public interface TeamService {
    TeamResponse findAll(String token);
}
