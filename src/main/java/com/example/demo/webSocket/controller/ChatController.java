package com.example.demo.webSocket.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.messaging.simp.stomp.StompHeaderAccessor;
import org.springframework.stereotype.Controller;
import org.springframework.web.util.HtmlUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @author dahua
 * @time 2023/8/4 15:21
 */
@Controller
public class ChatController {

    @MessageMapping("/hello")
    @SendTo("/topic/greetings")
    public Map test(StompHeaderAccessor headerAccessor, Map map) {
        Map<String, Object> sessionAttributes = headerAccessor.getSessionAttributes();
        System.out.println(sessionAttributes);
        return new HashMap() {{
            put("Hello, ", HtmlUtils.htmlEscape((String) map.get("name")) + "!");
        }};
    }
}
