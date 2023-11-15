package com.example.emailintegrations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class EmailIntegrationsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmailIntegrationsApplication.class, args);
    }

}
