package com.mrdiipo.lending_engine.domain.model.service;

import com.mrdiipo.lending_engine.domain.model.User;
import com.mrdiipo.lending_engine.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class TokenValidationService {

    private final UserRepository userRepository;
    private  final RestTemplate restTemplate = new RestTemplate();

    public TokenValidationService(UserRepository userRepository, @Value("${security.baseurl") String securityContextBaseUrl) {
        this.userRepository = userRepository;
        this.securityContextBaseUrl = securityContextBaseUrl;
    }

    private final  String securityContextBaseUrl;

    public User validateTokenAndGetUSer(final String token){
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.add(HttpHeaders.AUTHORIZATION, token);
        HttpEntity httpEntity = new HttpEntity(httpHeaders);



    }
}
