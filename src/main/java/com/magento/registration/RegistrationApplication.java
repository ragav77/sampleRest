package com.magento.registration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;


@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan(basePackages = {"com.magento.registration"})
public class RegistrationApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(RegistrationApplication.class,args);
    }

    @Bean
    public RestTemplate getJsonRestTemplate()
    {
        return new RestTemplate();
    }





}
