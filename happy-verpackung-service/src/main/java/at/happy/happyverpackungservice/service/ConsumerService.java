package at.happy.happyverpackungservice.service;

import at.happy.dto.VerpackungEvent;
import at.happy.happyverpackungservice.model.PackList;
import at.happy.happyverpackungservice.repository.PackListRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ConsumerService {

    private final Logger logger = LoggerFactory.getLogger(ConsumerService.class);

    private final PackListRepository packListRepository;

    @KafkaListener(topics = "verpackung-topic", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(final @Payload VerpackungEvent message) {
        logger.info(String.format("#### -> Consumed message: {}", message));
        if (!message.getItemsToPack().isEmpty()) {
            var pl = new PackList();
            pl.setItem(message.getItemsToPack().get(0));
            packListRepository.save(pl);

        }
    }
}
