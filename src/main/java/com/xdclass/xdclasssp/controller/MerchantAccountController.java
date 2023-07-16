package com.xdclass.xdclasssp.controller;

import com.xdclass.xdclasssp.config.RabbitMQConfig;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/admin/merchant")
public class MerchantAccountController {


    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("check")
    public Object check() {


        rabbitTemplate.convertAndSend(RabbitMQConfig.NEW_MERCHANT_EXCHANGE,RabbitMQConfig.NEW_MERCHANT_ROUTING_KEY, "商家账号通过");

        //TODO 修改数据库商家账号状态

        Map<String, Object> map = new HashMap<>();
        map.put("code", 0);
        map.put("msg", "测试测试测试审核通过，请在10秒内完成测试操作");

        return map;
    }

}
