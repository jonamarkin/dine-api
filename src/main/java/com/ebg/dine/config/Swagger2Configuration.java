package com.ebg.dine.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@EnableSwagger2
@Configuration
public class Swagger2Configuration {

    @Bean
    public Docket productApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo( apiInfo() )
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.ebg.dine"))
                .paths(regex("/api.*"))
                .build();
    }

    private ApiInfo apiInfo() {
        return  new ApiInfoBuilder()
                .title("Dine API")
                .description("This document provides overview of the functionalities Dine API (Application Programming Interface). "
                        + "It clearly spells out the various methods listed below with their request and response in JSON. "
                        + "Introduction This API is documented in OpenAPI format and is based on specification available on Dine provided by EBG team. "
                        + "This API documentation is provided upon the basis that the above institution has provided access and authorization of use")
                .contact(new Contact("Jonathan Markin", "www.google.com", "jona10711@gmail.com"))
                .version("v1.0")
                .build();
    }
}
