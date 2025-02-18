package com.jwtdemo.jwtdemo.Controller;

import com.jwtdemo.jwtdemo.Sevice.TokenService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {


    private final static Logger LOG = LoggerFactory.getLogger(AuthController.class);

    private final TokenService tokenService;

    public AuthController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @PostMapping("/token")
    public String token(Authentication authentication) {
        LOG.debug("Token is requested to generate by: '{}'", authentication.getName());
        String token = tokenService.generateToken(authentication);
        LOG.debug("Token is generated: '{}'", token);
        return token;
    }


}
