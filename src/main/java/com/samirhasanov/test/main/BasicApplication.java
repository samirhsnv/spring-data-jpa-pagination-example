package com.samirhasanov.test.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.samirhasanov.test.domain")
@EnableJpaRepositories(basePackages = "com.samirhasanov.test.dao")
@SpringBootApplication(scanBasePackages = "com.samirhasanov.test")
public class BasicApplication {
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}
