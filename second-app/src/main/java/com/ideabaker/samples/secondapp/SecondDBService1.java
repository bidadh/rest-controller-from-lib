package com.ideabaker.samples.secondapp;

import com.ideabaker.samples.restcontrollercommon.DatabaseAwareService;
import org.springframework.stereotype.Service;

@Service
public class SecondDBService1 implements DatabaseAwareService {
    @Override
    public String name() {
        return SecondDBService1.class.getName();
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
