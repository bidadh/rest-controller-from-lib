package com.ideabaker.samples.secondapp;

import com.ideabaker.samples.restcontrollercommon.AliveAwareService;
import org.springframework.stereotype.Service;

@Service
public class SecondAliveService1 implements AliveAwareService {
    @Override
    public boolean isAlive() {
        return true;
    }
}
