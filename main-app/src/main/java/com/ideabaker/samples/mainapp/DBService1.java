package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.DatabaseAwareService;
import org.springframework.stereotype.Service;

@Service
public class DBService1 implements DatabaseAwareService {
    @Override
    public String name() {
        return DBService1.class.getName();
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
