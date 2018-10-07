package org.manu.greeter;

import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@AllArgsConstructor
public class Greeter {
    private final GreeterConfig greeterConfig;

    public String greet(LocalDateTime localDateTime) {
        String name = greeterConfig.getUserName();
        int hourOfDay = localDateTime.getHour();

        if (hourOfDay >= 5 && hourOfDay < 12) {
            return String.format("Hello %s, %s", name, greeterConfig.getMorningGreeting());
        } else if (hourOfDay >= 12 && hourOfDay < 17) {
            return String.format("Hello %s, %s", name, greeterConfig.getAfternoonGreeting());
        } else if (hourOfDay >= 17 && hourOfDay < 20) {
            return String.format("Hello %s, %s", name, greeterConfig.getEveningGreeting());
        } else {
            return String.format("Hello %s, %s", name, greeterConfig.getNightGreeting());
        }
    }

    public String greet() {
        return greet(LocalDateTime.now());
    }
}
