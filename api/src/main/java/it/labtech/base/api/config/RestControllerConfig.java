package it.labtech.base.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.method.HandlerTypePredicate;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class RestControllerConfig implements WebMvcConfigurer {

    @Value("${labtech.api.rest.base-path}")
    private String apiRestBasepath;

    @Override
    public void configurePathMatch(PathMatchConfigurer configurer) {
        configurer.addPathPrefix(apiRestBasepath, HandlerTypePredicate.forAnnotation(RestController.class));
    }
}
