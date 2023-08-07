package com.example.demo.utils;

import com.example.demo.exception.JsonParseException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author dahua
 * @time 2023/8/7 17:51
 */
public class JSON {

    private static ObjectMapper objectMapper = (ObjectMapper) SpringBeanUtils.getBean(ObjectMapper.class);

    public static String toJSONString(Object obj) {
        try {
            return objectMapper.writeValueAsString(obj);
        } catch (JsonProcessingException e) {
            throw new JsonParseException();
        }
    }
}
