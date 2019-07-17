package com.javatpoint;  
  
import org.springframework.boot.SpringApplication;  
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;  
  
@SpringBootApplication  
@ComponentScan("com")
public class SpringBootJpaApplication {  
    public static void main(String[] args) {  
        SpringApplication.run(SpringBootJpaApplication.class, args);  
    }  
}  