package com.ynz.demo.springconfigprop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.validation.constraints.NotNull;

@Data
@ConfigurationProperties(prefix = "promotionplan")
public class PromotionPlan {
    @NotNull
    private Integer productId;

    @NotNull
    private Double discountRate;
}
