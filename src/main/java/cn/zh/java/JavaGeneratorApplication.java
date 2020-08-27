package cn.zh.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
public class JavaGeneratorApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaGeneratorApplication.class, args);
    }

}
