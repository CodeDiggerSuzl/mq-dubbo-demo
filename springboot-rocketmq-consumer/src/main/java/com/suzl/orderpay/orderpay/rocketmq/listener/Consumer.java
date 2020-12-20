package com.suzl.orderpay.orderpay.rocketmq.listener;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Component;


/**
 * @author Suz1
 * @date 2020/12/20 11:01 下午
 */
@Component
@Slf4j
@RocketMQMessageListener(consumerGroup = "${rocketmq.producer.group}", topic = "spring-mq")
public class Consumer implements RocketMQListener<String> {
    @Override
    public void onMessage(String msg) {
        System.out.println(JSON.toJSONString(msg));
    }
}
