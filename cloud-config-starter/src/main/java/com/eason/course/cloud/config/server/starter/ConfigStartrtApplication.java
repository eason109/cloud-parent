package com.eason.course.cloud.config.server.starter;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * Created by Eason on 7/19/2017.
 */
@SpringBootApplication
public class ConfigStartrtApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ConfigStartrtApplication.class).web(true).run(args);
    }
}

