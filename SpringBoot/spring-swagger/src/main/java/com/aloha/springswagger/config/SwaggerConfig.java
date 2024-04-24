package com.aloha.springswagger.config;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                            .group("group-aloha")
                            .pathsToMatch("/api/**", "/board/**")
                            .build()
                            ;
    }

    @Bean
    public OpenAPI springTestOpenAPI(){
        return new OpenAPI()
                    .info(new Info().title("Test Project API")
                                    .description("테스트 프로젝트 API 입니다.")
                                .version("v0.0.1")
                    );
    }


}
