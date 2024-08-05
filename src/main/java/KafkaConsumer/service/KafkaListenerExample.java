package KafkaConsumer.service;

import KafkaConsumer.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListenerExample {

       @KafkaListener(topics = "demo_topic", groupId = "myGroup")
       void listener(Message data) {
              System.out.println(data);
       }
}