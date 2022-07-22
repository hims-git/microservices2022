package com.bvr.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringCloudConfig {

    @Bean
    public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route(r -> r.path("/employee/**")
                        .uri("http://localhost:8081/"))


                .route(r -> r.path("/consumer/**")
                        .uri("http://localhost:8082/"))
                .build();
    }

    /*
    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
                .path("/get")
                .filters(f -> f.addRequestHeader("Hello", "World"))
                .uri("http://httpbin.org:80"))
            .route(p -> p
                .host("*.circuitbreaker.com")
                .filters(f -> f.circuitBreaker(config -> config
                    .setName("mycmd")
                    .setFallbackUri("forward:/fallback")))
                .uri("http://httpbin.org:80"))
            .build();
    }
    
    
    @Bean
    public RouteLocator myRoutes1(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
                .path("/get")
                .filters(f -> f.addRequestHeader("Hello", "World"))
                .uri("http://httpbin.org:80"))
            .route(p -> p
                .host("*.circuitbreaker.com")
                .filters(f -> f.circuitBreaker(config -> config.setName("mycmd")))
                .uri("http://httpbin.org:80")).
            build();
    }
    
    */
}