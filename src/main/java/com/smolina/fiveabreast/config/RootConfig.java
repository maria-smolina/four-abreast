package com.smolina.fiveabreast.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan({"com.smolina.fiveabreast.service"})
@Import(DataBaseConfig.class)
public class RootConfig {
}
