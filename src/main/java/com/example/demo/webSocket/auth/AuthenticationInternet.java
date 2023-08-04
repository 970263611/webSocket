package com.example.demo.webSocket.auth;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * @author dahua
 * @time 2023/8/4 12:03
 */
@Component
@Primary
public class AuthenticationInternet implements Authentication {

    @Override
    public boolean check(String token) {
        return true;
    }
}
