package com.Vitality.Vitality.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class loginConfig{
    
    @SuppressWarnings("deprecation")
    @Bean
    public SecurityFilterChain sFC(HttpSecurity http) throws Exception{

        http
                .authorizeRequests(requests -> requests
                .requestMatchers("/css/**", "/js/**").permitAll() // Allow access to static resources
                .anyRequest().authenticated())
                .formLogin(login -> login
                        .loginPage("/login")
                        .permitAll());

        return http.build();

    }
    // @Override
    // protected void configure(HttpSecurity http) throws Exception {
    //     http
    //         .authorizeRequests()
    //             .anyRequest().authenticated()
    //             .and()
    //         .formLogin()
    //             .loginPage("/login");
    // }



    
    


@Bean
InMemoryUserDetailsManager users(){

    return new InMemoryUserDetailsManager(

    User.withUsername("user").password("{noop}password").roles("USER").build()

    );
}

   


}
