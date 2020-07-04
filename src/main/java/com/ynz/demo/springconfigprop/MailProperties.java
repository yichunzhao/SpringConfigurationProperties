package com.ynz.demo.springconfigprop;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "mail")
@Setter
@Getter
public class MailProperties {
    private String hostname;
    private String port;
    private String from;
    
}
