package jms.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import javax.jms.*;

/**
 * Created by Thpffcj on 2017/7/30.
 */
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    JmsTemplate jmsTemplate;

//    @Resource(name = "queueDestination")
    @Resource(name = "topicDestination")
    Destination destination;

    public void sendMessage(final String message) {
        //使用JmsTemplat发送消息
        jmsTemplate.send(destination, new MessageCreator() {
            //创建一个消息
            public Message createMessage(Session session) throws JMSException {
                TextMessage textMessage = session.createTextMessage(message);
                return textMessage;
            }
        });
        System.out.println("发送消息：" + message);
    }
}
