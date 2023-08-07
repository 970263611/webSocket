package com.example.demo.utils;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author dahua
 * @time 2023/8/7 17:53
 */
@Component
public class SpringBeanUtils implements ApplicationContextAware {

    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        SpringBeanUtils.applicationContext = applicationContext;
    }

    public static Object getBean(String beanName) {
        Object bean = applicationContext.getBean(beanName);
        assert bean == null;
        return bean;
    }

    public static Object getBean(Class beanClass) {
        Object bean = applicationContext.getBean(beanClass);
        assert bean == null;
        return bean;
    }
}
