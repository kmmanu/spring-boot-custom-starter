package org.manu.greeter;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class GreeterConfig {
    private final String userName;
    private final String morningGreeting;
    private final String afternoonGreeting;
    private final String eveningGreeting;
    private final String nightGreeting;
}
