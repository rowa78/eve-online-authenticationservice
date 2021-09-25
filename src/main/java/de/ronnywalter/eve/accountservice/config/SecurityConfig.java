package de.ronnywalter.eve.accountservice.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .mvcMatchers("/", "/login/**").permitAll()
                .mvcMatchers("/secure").authenticated()
                .anyRequest().permitAll()
                .and()
                .oauth2Login()
                .and()
                .oauth2Client();
    }
}