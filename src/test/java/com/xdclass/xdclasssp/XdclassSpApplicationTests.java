package com.xdclass.xdclasssp;

import com.xdclass.xdclasssp.config.RabbitMQConfig;
import org.junit.jupiter.api.Test;
import org.springframework.amqp.core.ReturnedMessage;
import org.springframework.amqp.rabbit.connection.CorrelationData;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class XdclassSpApplicationTests {

    @Autowired
    public RabbitTemplate template;
//
//    @Test
//    void testSend() {
//        System.out.println("\nSend\n");
//        template.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "product.new", "新订单");
//    }
//
//    @Test
//    void testConfirmCallback() {
//
//        System.out.println("进函数前1");
//
//
//
//        template.setConfirmCallback(new RabbitTemplate.ConfirmCallback() {
//
//            /**
//             *
//             * @param correlationData 配置
//             * @param ack 交换机是否收到消息，true是成功， false是失败
//             * @param cause 是失败的原因
//             */
//
//            @Override
//            public void confirm(CorrelationData correlationData, boolean ack, String cause) {
//                System.out.println("ConfirmCallback=====>");
//                System.out.println("ConfirmCallback=====>correlationData=" + correlationData);
//                System.out.println("ConfirmCallback=====>ack=" + ack);
//                System.out.println("ConfirmCallback=====>cause=" + cause);
//
//                if (ack) {
//                    System.out.println("\n发送成功\n");
//                    //更新数据库 消息的状态为成功 TODO
//                } else {
//                    System.out.println("发送失败，记录到日志或者数据库");
//                    //更新数据库 消息的状态为失败 TODO
//                }
//
//            }
//        });
//
//        try {
//            // 休眠3秒
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println("进函数后2");
//
//        //数据库新增一个消息记录，状态是发送 TODO
//        System.out.println("\n===发送消息前1===\n");
//        //发送消息
//        template.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "order_new", "新订单");
//
//        System.out.println("\n===发送消息后2===\n");
//    }
//
//    @Test
//    void testReturnCallback() {
//
//        template.setReturnsCallback(new RabbitTemplate.ReturnsCallback() {
//            @Override
//            public void returnedMessage(ReturnedMessage returnedMessage) {
//                int code = returnedMessage.getReplyCode();
//                System.out.println("code=" + code);
//                System.out.println("returnMessage=" + returnedMessage.toString());
//
//            }
//        });
//
//        template.convertAndSend(RabbitMQConfig.EXCHANGE_NAME, "order.new", "新订单ReturnCallback");
//    }

}
