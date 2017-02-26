package com.smolina.fourabreast.config;

import com.smolina.fourabreast.service.GameMoveService;
import com.smolina.fourabreast.service.GameScoreService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {
    @Bean
    public GameMoveService gameMoveService() {
        return new GameMoveService();
    }

    @Bean
    public GameScoreService gameScoreService() {
        return new GameScoreService();
    }
}
