package com.fsm.configclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    private final ConfigValues configValues;

    @Autowired
    public ConfigController(ConfigValues configValues) {
        this.configValues = configValues;
    }

    @GetMapping("/")
    public String hello() {
        return configValues.greetingMessage;
    }

}
