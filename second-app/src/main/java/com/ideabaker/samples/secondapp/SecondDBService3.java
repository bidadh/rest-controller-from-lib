package com.ideabaker.samples.secondapp;

import com.ideabaker.samples.restcontrollercommon.DatabaseAwareService;
import org.springframework.stereotype.Service;

@Service
public class SecondDBService3 implements DatabaseAwareService {
    @Override
    public String name() {
        return SecondDBService3.class.getName();
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
