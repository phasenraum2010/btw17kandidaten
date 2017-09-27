package org.woehlke.btw17.kandidaten.configuration.spring;

import org.springframework.boot.autoconfigure.web.DefaultErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.context.annotation.Bean;
import org.springframework.session.jdbc.config.annotation.web.http.EnableJdbcHttpSession;

@EnableJdbcHttpSession
public class HttpSessionConfig {

    @Bean
    public ErrorAttributes errorAttributes(){
        return new DefaultErrorAttributes();
    }
}