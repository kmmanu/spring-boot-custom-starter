package org.manu.greeter;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.Month;

import static org.junit.Assert.*;

public class GreeterTest {

    @Test
    public void testGreet() {
        LocalDateTime morning = LocalDateTime.of(2018, Month.OCTOBER, 8, 9, 0);
        GreeterConfig greeterConfig = GreeterConfig.builder()
                .userName("manu")
                .morningGreeting("Good morning")
                .build();
        Greeter greeter = new Greeter(greeterConfig);

        String greet = greeter.greet(morning);

        assertThat(greet, CoreMatchers.is("Hello manu, Good morning"));
    }
}