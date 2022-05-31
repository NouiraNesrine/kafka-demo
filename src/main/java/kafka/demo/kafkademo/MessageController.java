package kafka.demo.kafkademo;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ai/v1/messages")
public class MessageController {

    private KafkaTemplate<String,String> kafkaTemplate;
    @PostMapping
    public void publishMessage(@RequestBody MessageRequest request){
        kafkaTemplate.send("dodo",request.getMessage());
    }
}
