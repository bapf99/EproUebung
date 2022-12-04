package de.thbingen.epro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OurWebApplication {
    public static void main(String[] args) {
        //SpringApplication.run(OurWebApplication.class, args);
        ApplicationContext context = new AnnotationConfigApplicationContext(BasicConfiguration.class);
    }
}
