package com.magento.registration.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@EnableAutoConfiguration
@PropertySource("application.properties")
@ConfigurationProperties("magento.register")
public class AppConfig {

    public String magentoRegistrationEndpoint;

    public String getMagentoRegistrationEndpoint() {
        return magentoRegistrationEndpoint;
    }

    public void setMagentoRegistrationEndpoint(String magentoRegistrationEndpoint) {
        this.magentoRegistrationEndpoint = magentoRegistrationEndpoint;
    }

}
