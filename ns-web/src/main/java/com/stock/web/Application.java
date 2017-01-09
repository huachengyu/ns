package com.stock.web;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

/**
 * Spring Java Configuration and Bootstrap
 *
 * @author Jibeom Jung
 */
@EnableAutoConfiguration
@ComponentScan
public class Application extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }

    @Override
    public void run(String... strings) throws Exception {
        // This method called before the server starts.
        // Additional configurations can be placed here.
    }
}