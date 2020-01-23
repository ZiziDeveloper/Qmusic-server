package com.zizi.qmusic.server.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
@EnableWebSecurity
public class BasicAuthConfiguration extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        JdbcUserDetailsManager userDetailsService = new JdbcUserDetailsManager();
        userDetailsService.setDataSource(dataSource);
        userDetailsService.setEnableGroups(true);
        userDetailsService.setEnableAuthorities(false);
        userDetailsService.setGroupAuthoritiesByUsernameQuery(SqlConstant.groupAuthoritiesByUsernameQuery);
        userDetailsService.setUsersByUsernameQuery(SqlConstant.usersByUsernameQuery);

        auth
                .userDetailsService(userDetailsService)
                .passwordEncoder(new MyPasswordEncoder());

    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/admin/**").hasAuthority("admin")
                    .anyRequest().authenticated().and()
                .formLogin().and()
                .httpBasic();
    }

}

