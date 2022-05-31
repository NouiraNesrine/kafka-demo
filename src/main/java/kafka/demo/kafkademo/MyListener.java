package kafka.demo.kafkademo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MyListener {

    @KafkaListener(topics = "dodo",groupId = "groupId-1")
    void listener(String data){
        System.out.println("listenning "+data+" .");
    }
}
