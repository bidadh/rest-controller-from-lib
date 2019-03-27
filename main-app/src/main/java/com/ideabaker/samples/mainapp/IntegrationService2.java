package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.IntegrationAwareService;
import org.springframework.stereotype.Service;

@Service
public class IntegrationService2 implements IntegrationAwareService {
    @Override
    public String name() {
        return IntegrationService2.class.getName();
    }

    @Override
    public boolean isAlive() {
        return true;
    }
}
