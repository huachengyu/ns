package com.stock.web.config;

import com.stock.web.interceptor.URLInterceptor;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by IntelliJ IDEA.
 * User: huacy
 * Date: 2017/1/8
 * Time: 22:18
 */
@Configuration
@EnableAutoConfiguration
public class CoreConfig extends WebMvcConfigurerAdapter {

    @Bean
    public WebMvcConfigurerAdapter initAdapter(){
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/angular/**").addResourceLocations("/WEB-INF/assets/angular/");
                registry.addResourceHandler("/app/**").addResourceLocations("/WEB-INF/assets/app/");
                registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/assets/bootstrap/");
                registry.addResourceHandler("/img/**").addResourceLocations("/WEB-INF/assets/img/");
                registry.addResourceHandler("/scripts/**").addResourceLocations("/WEB-INF/assets/scripts/");
                registry.addResourceHandler("/styles/**").addResourceLocations("/WEB-INF/assets/styles/");
                registry.addResourceHandler("/**").addResourceLocations("/WEB-INF/views/");
            }
        };
    }

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver() {
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setSuffix(".html");
        return resolver;
    }

    @Bean
    public HandlerInterceptor getMyInterceptor(){
        return new URLInterceptor();
    }
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        registry.addInterceptor(getMyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
