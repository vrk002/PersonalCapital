package com.personalcapital.budgetplan.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket postsApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.personalcapital.budgetplan.rest"))
                .paths(regex("/.*"))
                .build()
                .apiInfo(metaData());
    }

    private ApiInfo metaData() {

        Contact venu = new Contact("Venu Kottapally", "google.com", "vrk002@gmail.com");

        ApiInfo apiInfo = new ApiInfo(
                "Budget Plan Repository",
                "Spring Boot REST API for Budget Plan Information",
                "1.0",
                "Terms Of service", "Venu Kottapally",
                "Apache License Version 2.0",
                "https://www.apache.org/licenses/LICENSE-2.0");

        return apiInfo;
    }
}
