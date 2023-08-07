package com.example.demo.webSocket.controller;

import com.example.demo.utils.JSON;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
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
    public String test(StompHeaderAccessor headerAccessor, Map map) {
        System.out.println(headerAccessor.getUser().getName());
        HashMap name = new HashMap() {{
            put("Hello, ", HtmlUtils.htmlEscape((String) map.get("name")) + "!");
        }};
        return JSON.toJSONString(name);
    }
}
