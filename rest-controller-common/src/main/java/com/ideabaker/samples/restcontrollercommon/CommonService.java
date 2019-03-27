package com.ideabaker.samples.restcontrollercommon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Slf4j
@Service
public class CommonService implements ApplicationContextAware {
    private Collection<AliveAwareService> aliveServices;
    private Collection<IntegrationAwareService> integrationServices;
    private Collection<DatabaseAwareService> dbServices;

    public Map<String, String> message() {
        Map<String,String> result = new HashMap<>();
        aliveServices.forEach(s -> result.put(s.getClass().getName(), String.valueOf(s.isAlive())));
        integrationServices.forEach(s -> result.put(s.name(), String.valueOf(s.isAlive())));
        dbServices.forEach(s -> result.put(s.name(), String.valueOf(s.isAlive())));
        return result;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        aliveServices = applicationContext.getBeansOfType(AliveAwareService.class).values();
        integrationServices = applicationContext.getBeansOfType(IntegrationAwareService.class).values();
        dbServices = applicationContext.getBeansOfType(DatabaseAwareService.class).values();
    }
}

