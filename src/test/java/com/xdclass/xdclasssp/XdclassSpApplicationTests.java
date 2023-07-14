package com.xdclass.xdclasssp;

import com.xdclass.xdclasssp.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XdclassSpApplicationTests {

	@Autowired
	public RabbitTemplate template;

	@Test
	void testSend() {
		template.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "order.new", "新订单");
	}

}
