package com.ideabaker.samples.mainapp;

import com.ideabaker.samples.restcontrollercommon.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
class HomeController {
    private final CommonService commonService;

    @Autowired
    HomeController(CommonService commonService) {
        this.commonService = commonService;
    }

    @GetMapping("/")
    public Map<String,String> home() {
        return Collections.singletonMap("message", "Hello Arthur!");
    }

    @GetMapping("/common")
    public Map<String,String> commonHome() {
        return commonService.message();
    }
}
