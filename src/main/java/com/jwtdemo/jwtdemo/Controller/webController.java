package com.jwtdemo.jwtdemo.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class webController {

    @GetMapping("")
    public String home(Principal principal) {
        return "Hello " + principal.getName();
    }

}
