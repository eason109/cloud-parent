package com.eason.course.cloud.provider;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by Eason on 7/18/2017.
 */
@EnableDiscoveryClient
@SpringBootApplication
public class ComputeServiceApplicationOther {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ComputeServiceApplicationOther.class).web(true).run(args);
    }
}
