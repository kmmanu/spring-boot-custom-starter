package org.manu.greeter.autoconfigure;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "manu.greeter")
public class GreeterProperties {
    private String userName;
    private String morningGreeting;
    private String afternoonGreeting;
    private String eveningGreeting;
    private String nightGreeting;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMorningGreeting() {
        return morningGreeting;
    }

    public void setMorningGreeting(String morningGreeting) {
        this.morningGreeting = morningGreeting;
    }

    public String getAfternoonGreeting() {
        return afternoonGreeting;
    }

    public void setAfternoonGreeting(String afternoonGreeting) {
        this.afternoonGreeting = afternoonGreeting;
    }

    public String getEveningGreeting() {
        return eveningGreeting;
    }

    public void setEveningGreeting(String eveningGreeting) {
        this.eveningGreeting = eveningGreeting;
    }

    public String getNightGreeting() {
        return nightGreeting;
    }

    public void setNightGreeting(String nightGreeting) {
        this.nightGreeting = nightGreeting;
    }
}
