// package com.rentrover.RentRover.config;

// import org.springframework.context.annotation.Bean;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
// import org.springframework.security.core.userdetails.User;
// import org.springframework.security.provisioning.InMemoryUserDetailsManager;


// @EnableWebSecurity
// public class LoginConfig extends WebSecurityConfiguration{
    

//      @Bean
//     InMemoryUserDetailsManager users(){

//         return new InMemoryUserDetailsManager(
//             User.withUsername("admin").password("{noop}password").roles("ADMIN").build(),
//             User.withUsername("user").password("{noop}password").roles("USER").build()
//         );
//     }


//     @SuppressWarnings({ "removal" })
//     @Bean
//     public void configure(HttpSecurity http) throws Exception {
//         http
//         .authorizeHttpRequests()
//                 .anyRequest().authenticated()
//                 .and()
//                 .formLogin()
//                 .loginPage("/login")
//                 .permitAll();

// }
// }