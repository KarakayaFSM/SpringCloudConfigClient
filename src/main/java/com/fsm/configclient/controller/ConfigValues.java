package com.fsm.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigValues {

    @Value("${greeting.message}")
    public String greetingMessage;

}
