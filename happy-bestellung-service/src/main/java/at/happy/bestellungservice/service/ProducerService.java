package at.happy.bestellungservice.service;

import at.happy.dto.VerpackungEvent;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProducerService {

    private static final Logger LOGGER = LoggerFactory.getLogger(ProducerService.class);

    @Value("${spring.kafka.topic.name}")
    private static final String TOPIC = "verpackung-topic";
    private final KafkaTemplate<String, VerpackungEvent> kafkaTemplate;

    public void sendMessage(VerpackungEvent event){
        LOGGER.info("Order event => " + event.toString());


        // create Message
        Message<VerpackungEvent> message = MessageBuilder
                .withPayload(event)
                .setHeader(KafkaHeaders.TOPIC, TOPIC)
                .build();


        kafkaTemplate.send(message);
    }
}
