package org.manu.greeter.autoconfigure;


import org.manu.greeter.Greeter;
import org.manu.greeter.GreeterConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(GreeterProperties.class)
@ConditionalOnClass(Greeter.class)
public class GreeterAutoConfiguration {
    @Autowired
    private GreeterProperties greeterProperties;

    @Bean
    @ConditionalOnMissingBean
    public GreeterConfig greeterConfig() {
        String userName = greeterProperties.getUserName() == null ? System.getProperty("user.name") : greeterProperties.getUserName();
        String morningGreeting = greeterProperties.getMorningGreeting() == null ? "Good Morning" : greeterProperties.getMorningGreeting();
        String afternoonGreeting = greeterProperties.getAfternoonGreeting() == null ? "Good Afternoon" : greeterProperties.getAfternoonGreeting();
        String eveningGreeting = greeterProperties.getEveningGreeting() == null ? "Good Evening" : greeterProperties.getEveningGreeting();
        String nightGreeting = greeterProperties.getNightGreeting() == null ? "Good Night" : greeterProperties.getNightGreeting();

        return GreeterConfig.builder()
                .userName(userName)
                .morningGreeting(morningGreeting)
                .afternoonGreeting(afternoonGreeting)
                .eveningGreeting(eveningGreeting)
                .nightGreeting(nightGreeting)
                .build();
    }

    @Bean
    @ConditionalOnMissingBean
    public Greeter greeter(GreeterConfig greeterConfig) {
        return new Greeter(greeterConfig);
    }
}
