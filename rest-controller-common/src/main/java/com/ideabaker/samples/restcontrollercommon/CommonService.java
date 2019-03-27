package com.ideabaker.samples.restcontrollercommon;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;

@Slf4j
@Service
public class CommonService implements ApplicationContextAware {
    private Collection<AliveAwareService> aliveServices;
    private Collection<IntegrationAwareService> integrationServices;
    private Collection<DatabaseAwareService> dbServices;

    public Map<String, String> message() {
        aliveServices.forEach(s -> System.out.println(s.getClass().getName()));
        integrationServices.forEach(s -> System.out.println(s.name() + " is alive?: " + s.isAlive()));
        dbServices.forEach(s -> System.out.println(s.name() + " is alive?: " + s.isAlive()));
        return Collections.singletonMap("common message", "Hello Arthur! from common");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        aliveServices = applicationContext.getBeansOfType(AliveAwareService.class).values();
        integrationServices = applicationContext.getBeansOfType(IntegrationAwareService.class).values();
        dbServices = applicationContext.getBeansOfType(DatabaseAwareService.class).values();
    }
}

