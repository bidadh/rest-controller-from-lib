package com.ideabaker.samples.secondapp;

import com.ideabaker.samples.restcontrollercommon.IntegrationAwareService;
import org.springframework.stereotype.Service;

@Service
public class SecondIntegrationService1 implements IntegrationAwareService {
    @Override
    public String name() {
        return SecondIntegrationService1.class.getName();
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
