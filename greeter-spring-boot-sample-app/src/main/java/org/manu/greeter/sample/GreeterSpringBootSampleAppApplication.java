package org.manu.greeter.sample;

import org.manu.greeter.Greeter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GreeterSpringBootSampleAppApplication implements CommandLineRunner {
    @Autowired
    private Greeter greeter;

    public static void main(String[] args) {
        SpringApplication.run(GreeterSpringBootSampleAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String message = greeter.greet();
        System.out.println("\n\n");
        System.out.println(message);
        System.out.println("\n\n");
    }
}
