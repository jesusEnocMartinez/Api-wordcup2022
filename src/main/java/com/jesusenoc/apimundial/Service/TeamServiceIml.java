package com.jesusenoc.apimundial.Service;

import com.jesusenoc.apimundial.Dto.TeamResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service
public class TeamServiceIml extends AbstracCliente implements TeamService{
    public TeamServiceIml(RestTemplate restTemplate) {
        super(restTemplate);
    }
    @Override
    public TeamResponse findAll(String token) {
        String uri = baseUrl + "/team";
        HttpEntity<Void> requestEntity = new HttpEntity<>(this.buildAuthToken(token));
        ResponseEntity<TeamResponse> response = restTemplate.exchange(
                uri, HttpMethod.GET, requestEntity , TeamResponse.class);

        if (response.getStatusCode().is2xxSuccessful()) {
            log.info("Successfully user creation: {}", response.getBody().getStatus());
            return response.getBody();
        }
        log.error("Error in user creation - httpStatus was: {}", response.getStatusCode());
        throw new RuntimeException("Error");
    }
}
