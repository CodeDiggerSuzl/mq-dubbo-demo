package com.suzl.orderpay.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.suzl.orderpay.orderpay.service.IUserService;
import org.springframework.stereotype.Component;

/**
 * @author Suz1
 * @date 2020/12/21 1:03 上午
 */
@Component
@Service(interfaceClass = IUserService.class)
public class UserServiceImpl implements IUserService {
    /**
     * test interface
     *
     * @param name name
     * @return str
     */
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }

}
