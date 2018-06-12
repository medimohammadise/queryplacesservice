package com.jimdo.queryplace.queryplaceservice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.zalando.problem.ProblemModule;
@Configuration
public class JacksonConfiguration {
    /*
    I'm using zalando library for translating back all exceptions thanks for https://github.com/zalando/problem
     */
    @Bean
    ProblemModule problemModule(){
        return new ProblemModule();
    }
}
