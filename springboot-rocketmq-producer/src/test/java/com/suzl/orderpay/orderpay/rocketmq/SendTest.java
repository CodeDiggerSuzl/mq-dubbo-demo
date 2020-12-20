package com.suzl.orderpay.orderpay.rocketmq;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Suz1
 * @date 2020/12/20 10:40 下午
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {ProducerApp.class})
public class SendTest {
    @Autowired
    private RocketMQTemplate mqTemplate;

    @Test
    public void sendTest() {
        mqTemplate.convertAndSend("spring-mq", "hello spring rocketmq");
    }
}
