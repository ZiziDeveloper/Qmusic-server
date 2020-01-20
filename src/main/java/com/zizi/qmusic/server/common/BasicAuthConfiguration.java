package com.zizi.qmusic.server.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class BasicAuthConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //BCryptPasswordEncoder
//        auth
//                .inMemoryAuthentication().passwordEncoder(new MyPasswordEncoder())
//                    .withUser("fanhuajun").password("1").roles("USER").and()
//                    .withUser("fanhuajun2").password("1").roles("ADMIN");
        auth
                .jdbcAuthentication().passwordEncoder(new MyPasswordEncoder())
                .dataSource(dataSource);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http
                .authorizeRequests()
                .antMatchers("/admin/**").hasRole("admin")
                .anyRequest().authenticated().and()
                .formLogin().and()
                .httpBasic();
    }

}

