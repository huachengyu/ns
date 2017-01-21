package com.stock.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("test")
                .password("test")
                .roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.httpBasic().and()
                .csrf().disable()
                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/rest/contacts*/**").permitAll()
//                .antMatchers(HttpMethod.GET, "/rest/photos*/**").permitAll()
//                .antMatchers("/rest/**").authenticated()
                .anyRequest().hasRole("USER")
                .and()
                .formLogin()
                .permitAll()
                .and()
                .sessionManagement()
                .maximumSessions(1)
                .expiredUrl("/logout");
    }
}
