package at.happy.bestellungservice.controller;

import at.happy.bestellungservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @GetMapping(value = "/place-order/{itemShortName}")
    public String placeOrder(@PathVariable String itemShortName){
        return orderService.placeOrder(itemShortName);
    }
}
