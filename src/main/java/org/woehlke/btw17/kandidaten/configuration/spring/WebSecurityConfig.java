package org.woehlke.btw17.kandidaten.configuration.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.woehlke.btw17.kandidaten.configuration.properties.KandidatenProperties;

@Configuration
@EnableWebSecurity
@EnableSpringDataWebSupport
//TODO: Test this with:
//@EnableRedisHttpSession
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
            .authorizeRequests()
            .antMatchers(
                kandidatenProperties.getWebSecurityConfigPublicPathsAsArray()
            )
            .permitAll()
            .anyRequest().authenticated()
            .and()
            .formLogin()
            .loginPage("/login")
            .failureForwardUrl("/login")
            .defaultSuccessUrl("/adm")
            .permitAll()
            .and()
            .logout()
            .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
            .logoutSuccessUrl("/logout_success")
            .permitAll();
    }

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        String user = kandidatenProperties.getLoginUsername();
        String pwd = kandidatenProperties.getLoginPassword();
        String role = "USER";
        auth
            .inMemoryAuthentication()
            .withUser(user).password(pwd).roles(role);
    }


    @Autowired
    public WebSecurityConfig(KandidatenProperties kandidatenProperties) {
        this.kandidatenProperties = kandidatenProperties;
    }

    private final KandidatenProperties kandidatenProperties;

}
