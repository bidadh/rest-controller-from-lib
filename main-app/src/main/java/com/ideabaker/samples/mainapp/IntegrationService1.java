package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.IntegrationAwareService;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService1 implements IntegrationAwareService {
    @Override
    public String name() {
        return IntegrationService1.class.getName();
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
