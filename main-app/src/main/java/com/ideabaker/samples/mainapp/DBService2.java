package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.DatabaseAwareService;
import org.springframework.stereotype.Service;

@Service
public class DBService2 implements DatabaseAwareService {
    @Override
    public String name() {
        return DBService2.class.getName();
    }

    @Override
    public boolean isAlive() {
        return false;
    }
}
