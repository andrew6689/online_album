package com.aiwinn.album.mq;

import com.aiwinn.album.util.PropertiesUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.QueueingConsumer;
import lombok.extern.slf4j.Slf4j;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public class RabbitMqClusterTest {

    private static String mqHost = PropertiesUtil.getProperties("mqHostTest");

    private static int mqPost = Integer.parseInt(PropertiesUtil.getProperties("mqPostTest"));

    private static String mqUser = PropertiesUtil.getProperties("mqUserTest");

    private static String mqPwd = PropertiesUtil.getProperties("mqPwdTest");

    private static String mqVirtualHost = PropertiesUtil.getProperties("mqVirtualHostTest");

    private static long mqXMaxPriority = Long.parseLong(PropertiesUtil.getProperties("mqXMaxPriorityTest"));

    public static String isStartRabbitMqLive = PropertiesUtil.getProperties("isStartRabbitMqLiveTest");

    private static String mqReceiveCmdLiveQueue = PropertiesUtil.getProperties("mqReceiveCmdLiveQueueTest");

    private static String mqReceiveCmdLiveExchange = PropertiesUtil.getProperties("mqReceiveCmdLiveExchangeTest");

    private static String mqReceiveCmdLiveRoutingKey = PropertiesUtil.getProperties("mqReceiveCmdLiveRoutingKeyTest");

    private static String mqSendCmdLiveQueue = PropertiesUtil.getProperties("mqSendCmdLiveQueueTest");

    private static String mqSendCmdLiveExchange = PropertiesUtil.getProperties("mqSendCmdLiveExchangeTest");

    private static String mqSendCmdLiveRoutingKey = PropertiesUtil.getProperties("mqSendCmdLiveRoutingKeyTest");

    private static Channel channel = null;

    private static long count = 1;

    public static void consumer() {
        Connection connection = null;
        while (true) {
            try {
                if (channel == null) {
                    log.info("-------start rabbit mq host: " + mqHost + ", post: " + mqPost + ", user: " + mqUser +
                            ", pwd: " + mqPwd + ", virtual host: " + mqVirtualHost + ", x-max-priority: " +
                            mqXMaxPriority + ", queue: " + mqReceiveCmdLiveQueue  + ", exchange: " +
                            mqReceiveCmdLiveExchange + ", routingKey: " + mqReceiveCmdLiveRoutingKey + ", count: " +
                            count);
                    ConnectionFactory factory = new ConnectionFactory();
                    factory.setHost(mqHost);
                    factory.setPort(mqPost);
                    factory.setUsername(mqUser);
                    factory.setPassword(mqPwd);
                    factory.setVirtualHost(mqVirtualHost);
                    factory.setRequestedHeartbeat(60);
                    factory.setConnectionTimeout(5000);
                    connection = factory.newConnection();
                    channel = connection.createChannel();
                    channel.exchangeDeclare(mqReceiveCmdLiveExchange, "topic", true, false, null);
                    Map<String, Object> param = new HashMap<>();
                    param.put("x-max-priority", mqXMaxPriority);
                    channel.queueDeclare(mqReceiveCmdLiveQueue, true, false, false, param);
                    channel.queueBind(mqReceiveCmdLiveQueue, mqReceiveCmdLiveExchange, mqReceiveCmdLiveRoutingKey);
                    log.info("-------end rabbit mq host: " + mqHost + ", post: " + mqPost + ", user: " + mqUser +
                            ", pwd: " + mqPwd + ", virtual host: " + mqVirtualHost + ", x-max-priority: " +
                            mqXMaxPriority + ", queue: " + mqReceiveCmdLiveQueue  + ", exchange: " +
                            mqReceiveCmdLiveExchange + ", routingKey: " + mqReceiveCmdLiveRoutingKey + ", count: " +
                            count);
                    QueueingConsumer consumer = new QueueingConsumer(channel);
                    channel.basicConsume(mqReceiveCmdLiveQueue, true, consumer);
                    while (true) {
                        try {
                            QueueingConsumer.Delivery delivery = consumer.nextDelivery();
                            String message = new String(delivery.getBody(), StandardCharsets.UTF_8);
                            log.info("---message: " + message);
                        } catch (Exception e) {
                            e.printStackTrace();
                            try {
                                if (connection != null) {
                                    connection.close();
                                }
                            } catch (Exception e1) {
                                e1.printStackTrace();
                            } finally {
                                connection = null;
                            }
                            try {
                                if (channel != null) {
                                    channel.close();
                                }
                            } catch (Exception e2) {
                                e2.printStackTrace();
                            } finally {
                                channel = null;
                            }
                            try {
                                Thread.sleep(3000);
                                break;
                            } catch (Exception e3) {
                                e3.printStackTrace();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                try {
                    if (connection != null) {
                        connection.close();
                    }
                } catch (Exception e1) {
                    e1.printStackTrace();
                } finally {
                    connection = null;
                }
                try {
                    if (channel != null) {
                        channel.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                } finally {
                    channel = null;
                }
                try {
                    count++;
                    Thread.sleep(3000);
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public static String producer(String msg) {
        String res = null;
        try {
            channel.exchangeDeclare(mqSendCmdLiveExchange, "topic", true, false, null);

            channel.queueBind(mqSendCmdLiveQueue, mqSendCmdLiveExchange, mqSendCmdLiveRoutingKey);

            channel.basicPublish(mqSendCmdLiveExchange, mqSendCmdLiveRoutingKey, null,
                    msg.getBytes(StandardCharsets.UTF_8));

            log.info("------send rabbit mq msg: " + msg);
            res = "ok";
        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}
