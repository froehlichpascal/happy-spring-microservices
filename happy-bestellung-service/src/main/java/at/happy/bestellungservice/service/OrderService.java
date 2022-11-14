package at.happy.bestellungservice.service;

import at.happy.dto.ItemRequest;
import at.happy.dto.ItemResponse;
import at.happy.dto.VerpackungEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service
@Slf4j
public class OrderService {

    private RestTemplate restTemplate;

    private ProducerService producerService;

    @Autowired
    public OrderService(RestTemplate restTemplate, ProducerService producerService) {
        this.restTemplate = restTemplate;
        this.producerService = producerService;
    }

    public String placeOrder(String itemShortName) {

        var item = ItemRequest.builder().shortName(itemShortName).build();

        String serviceUrl = "http://HAPPY-LAGER-SERVICE/api/lager/in-stock";
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<ItemRequest> request = new HttpEntity<>(item, headers);

        ItemResponse response = restTemplate.postForObject(serviceUrl, request, ItemResponse.class);

        if (response != null) {
            if (response.isInStock()) {
                //TODO Make Order
                producerService.sendMessage(VerpackungEvent.builder()
                        .itemsToPack(Collections.singletonList(response.getShortName()))
                        .build());
                return "Successful";
            } else {
                return "Item is Out of Stock";
            }
        } else {
            return "Not a listed Item";
        }


    }
}
