package com.smolina.fourabreast.config;

import com.smolina.fourabreast.service.GameMoveCheck;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public GameMoveCheck gameMoveCheck() {
        return new GameMoveCheck();
    }
}
