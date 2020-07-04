package com.ynz.demo.springconfigprop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.util.Assert;

@SpringBootApplication
@ConfigurationPropertiesScan
public class DemoConfigurationProperties {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoConfigurationProperties.class, args);
        MailProperties mailProperties = context.getBean(MailProperties.class);

        Assert.isTrue(mailProperties.getFrom().equals("mailer@mail.com"), "unexpected value.");
        Assert.isTrue(mailProperties.getPort().equals("9000"), "unexpected value.");
        Assert.isTrue(mailProperties.getHostname().equals("host@mail.com"), "unexpected value.");

    }
}
