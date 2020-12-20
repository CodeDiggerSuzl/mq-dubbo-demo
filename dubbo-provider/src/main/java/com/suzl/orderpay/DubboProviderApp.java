package com.suzl.orderpay;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Suz1
 * @date 2020/12/21 12:59 上午
 */
@EnableDubboConfiguration
@SpringBootApplication
public class DubboProviderApp {
    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args);
    }
}
