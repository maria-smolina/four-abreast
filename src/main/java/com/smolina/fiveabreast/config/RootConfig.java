package com.smolina.fiveabreast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.smolina.fiveabreast.config", "com.smolina.fiveabreast.service"})
public class RootConfig {
}
