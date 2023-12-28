package org.spring.student.studentsystem.controller;


import org.spring.student.studentsystem.entity.AuthenticationBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicAuthenticationController {

    @GetMapping("basic")
    public AuthenticationBean BasicAuthentication()
    {
        return new AuthenticationBean("you are Authentication");
    }
}
