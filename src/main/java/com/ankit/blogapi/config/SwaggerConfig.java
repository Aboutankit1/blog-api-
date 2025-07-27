package com.ankit.blogapi.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI blogApiOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Blog API")
                        .description("CRUD Blog API with Spring Boot, JPA, MySQL")
                        .version("1.0.0"));
    }
}