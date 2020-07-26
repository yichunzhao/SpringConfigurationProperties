package com.ynz.demo.springconfigprop;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.util.Assert;

@SpringBootApplication
@Slf4j
public class DemoConfigurationProperties {


    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(DemoConfigurationProperties.class, args);
        MailProperties mailProperties = context.getBeansOfType(MailProperties.class).get("mailServer");
        MailProperties anotherMailProperties = context.getBeansOfType(MailProperties.class).get("anotherMailServer");

        Assert.isTrue(mailProperties.getFrom().equals("mailer@mail.com"), "unexpected value.");
        Assert.isTrue(mailProperties.getPort() == 9000, "unexpected value.");
        Assert.isTrue(mailProperties.getHostname().equals("host@mail.com"), "unexpected value.");

        Assert.isTrue(anotherMailProperties.getFrom().equals("anothermailer@mail.com"), "unexpected value.");
        Assert.isTrue(anotherMailProperties.getPort() == 9001, "unexpected value.");
        Assert.isTrue(anotherMailProperties.getHostname().equals("anotherhost@mail.com"), "unexpected value.");

        log.info("++++++++++++++++  END  ++++++++++++++++++++");
    }

    @Bean("mailServer")
    @ConfigurationProperties(prefix = "mail")
    public MailProperties mailProperties() {
        return new MailProperties();
    }

    @Bean("anotherMailServer")
    @ConfigurationProperties(prefix = "anothermail")
    public MailProperties anotherMailProperties() {
        return new MailProperties();
    }

}
