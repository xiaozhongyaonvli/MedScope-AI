package com.ai.config;

import com.ai.properties.JwtProperties;
import com.ai.utils.JwtUtil;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class JwtConfiguration {

    @Bean
    @ConditionalOnMissingBean
    public JwtUtil jwtUtil(JwtProperties jwtProperties){
        return new JwtUtil(jwtProperties);
    }
}
