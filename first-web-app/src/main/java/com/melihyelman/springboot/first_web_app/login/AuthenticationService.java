package com.melihyelman.springboot.first_web_app.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {

    boolean authenticate(String username, String password) {
        boolean isValidUserName = username.equalsIgnoreCase("melih");
        boolean isValidPassword = password.equalsIgnoreCase("123melih");

        return isValidUserName && isValidPassword;
    }
}
