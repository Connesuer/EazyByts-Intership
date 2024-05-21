package com.rentrover.RentRover.config;

// import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    // @Bean
    // JdbcUserDetailsManager users(DataSource dataSource){
    //     JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
    //     return jdbcUserDetailsManager;
    // }

    @Bean
    InMemoryUserDetailsManager users(){

        return new InMemoryUserDetailsManager(
            User.withUsername("admin").password("{noop}password").roles("ADMIN").build(),
            User.withUsername("user").password("{noop}password").roles("USER").build()
        );
    }

    @SuppressWarnings({ "deprecation", "removal" })
    @Bean
    SecurityFilterChain securityFilterChain (HttpSecurity http) throws Exception{
        
        return http
        .csrf(crsf -> crsf.ignoringRequestMatchers("/h2-console/**"))
        .authorizeRequests(auth -> auth
        .requestMatchers("/h2-console/**").permitAll()
        .anyRequest().authenticated()
        )
        .headers(headers->headers.frameOptions().sameOrigin())
    .formLogin(Customizer.withDefaults())
    .build();
    
    
}

}
