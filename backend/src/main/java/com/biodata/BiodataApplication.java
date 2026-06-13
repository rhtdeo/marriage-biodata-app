package com.biodata;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class BiodataApplication {

    public static void main(String[] args) {
        SpringApplication.run(BiodataApplication.class, args);
    }

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("Marriage Biodata Management API")
                .version("1.0.0")
                .description("REST API for Marriage Biodata Management System")
                .contact(new Contact()
                    .name("API Support")
                    .email("support@biodata.com")));
    }
}