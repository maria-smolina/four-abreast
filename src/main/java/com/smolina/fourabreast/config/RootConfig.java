package com.smolina.fourabreast.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(DataBaseConfig.class)
public class RootConfig {
}
