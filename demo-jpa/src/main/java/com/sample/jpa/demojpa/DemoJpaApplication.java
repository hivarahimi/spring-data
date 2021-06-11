package com.sample.jpa.demojpa;

import com.sample.jpa.demojpa.model.Customer;
import com.sample.jpa.demojpa.repository.CustomerRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;


@SpringBootApplication
public class DemoJpaApplication {

//    private static final Logger log = LoggerFactory.getLogger(DemoJpaApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }


    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }



}
