package com.ddavydov.photoappeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class PhotoAppEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppEurekaServerApplication.class, args);
    }

}
