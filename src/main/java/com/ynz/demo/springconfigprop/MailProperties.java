package com.ynz.demo.springconfigprop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

//@Component
@ConfigurationProperties(prefix = "mail")
@Setter
@Getter

public class MailProperties {
    @NotBlank
    private String hostname;

    @Min(1000)
    @Max(9000)
    private int port;

    @NotBlank
    private String from;

}
