package com.example.demo.config;

import org.springframework.cache.ehcache.EhCacheCacheManager;
import org.springframework.cache.ehcache.EhCacheManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CovidConfig implements WebMvcConfigurer {

    @Bean
    public EhCacheCacheManager cacheManager() {
        return new EhCacheCacheManager(ehCacheCacheManger().getObject());
    }

    @Bean
    public EhCacheManagerFactoryBean ehCacheCacheManger() {
        EhCacheManagerFactoryBean factory = new EhCacheManagerFactoryBean();
        factory.setConfigLocation(new ClassPathResource("ehcache.xml"));
        factory.setShared(true);
        return factory;
    }
}
