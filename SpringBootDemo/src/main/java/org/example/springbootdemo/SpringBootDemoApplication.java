package org.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(SpringBootDemoApplication.class, args);
        System.out.println("Hello World");
        Alien alien = context.getBean(Alien.class);
        alien.code();
        System.out.println(alien.getAge());
    }

}
