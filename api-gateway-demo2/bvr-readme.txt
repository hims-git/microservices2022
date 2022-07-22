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