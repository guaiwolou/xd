package com.guaiwolo.modules.video.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @Configuration  配置类就会被spring扫描
 */
@Data
@Configuration
@PropertySource(value="classpath:pay.properties")
public class WXConfig {
    @Value("${wxpay.id}")
    private String payAppid;
    @Value("${wxpay.sercert}")
    private String paySercert;
}
