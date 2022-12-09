package de.thbingen.epro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

@SpringBootApplication
public class OurWebApplication {
    public static void main(String[] args) {

        //ApplicationContext context = new AnnotationConfigApplicationContext(BasicConfiguration.class);
        SpringApplication.run(OurWebApplication.class, args);
        //Assert.notNull(context);
    }
}
