package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.AliveAwareService;
import org.springframework.stereotype.Service;

@Service
public class AliveService1 implements AliveAwareService {
    @Override
    public boolean isAlive() {
        return true;
    }
}
