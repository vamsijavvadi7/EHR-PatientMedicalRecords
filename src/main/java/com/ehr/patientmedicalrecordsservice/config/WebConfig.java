package com.ehr.patientmedicalrecordsservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("http://localhost:4200") // Allow your frontend domain
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Define allowed methods
                .allowCredentials(true); // If using cookies or authentication
    }
}
