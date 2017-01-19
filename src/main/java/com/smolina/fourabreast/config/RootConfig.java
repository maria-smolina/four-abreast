package com.smolina.fourabreast.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackageClasses = {GameMoveRepository.class})
@Import(DataBaseConfig.class)
public class RootConfig {
}
