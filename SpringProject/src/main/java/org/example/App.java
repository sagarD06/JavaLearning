package org.example;

import org.example.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien obj = context.getBean(Alien.class);
        System.out.println(obj.getAge());
        obj.code();

//        Desktop dk = context.getBean(Desktop.class);
//        dk.compile();


        //below is the XML way of configuration
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj = context.getBean("alien", Alien.class);
//        obj.code();
//        System.out.println(obj.getAge());
    }
}
