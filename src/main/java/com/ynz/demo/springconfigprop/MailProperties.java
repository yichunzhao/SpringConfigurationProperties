package com.ynz.demo.springconfigprop;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

//@ConfigurationProperties(prefix = "mail")
@Setter
@Getter
@NoArgsConstructor
public class MailProperties {
    @NotBlank(message = "mail hostname is compulsory")
    private String hostname;

    @Min(value = 1000, message = "port number cannot less than 1000")
    @Max(value = 9000, message = "port number cannot bigger than 9000")
    private int port;

    @NotBlank(message = "mail must has a source")
    private String from;

}
