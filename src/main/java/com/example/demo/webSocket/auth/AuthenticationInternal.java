package com.example.demo.webSocket.auth;

import org.springframework.stereotype.Component;

/**
 * @author dahua
 * @time 2023/8/4 12:10
 */
@Component
public class AuthenticationInternal implements Authentication {

    @Override
    public boolean check(String token) {
        return true;
    }
}
