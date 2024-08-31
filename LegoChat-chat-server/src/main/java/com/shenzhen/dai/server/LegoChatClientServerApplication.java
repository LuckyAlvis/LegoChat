package com.shenzhen.dai.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: 客户服务启动类
 * @author: daiyifan
 * @create: 2024-08-31 17:14
 */
@SpringBootApplication(scanBasePackages = "com.shenzhen.dai")
public class LegoChatClientServerApplication {
    public static void main(String[] args) {
        SpringApplication.run(LegoChatClientServerApplication.class, args);
    }
}
