package com.example.demo.webSocket.auth;

/**
 * @author dahua
 * @time 2023/8/4 12:03
 */
public interface Authentication {

    boolean check(String token);
}
