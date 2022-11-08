package at.happy.bestellungservice.service;

import antlr.debug.Tracer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderService {

    private final Tracer tracer;

    public String placeOrder(String itemShortName) {

        Span inventoryServiceLookup = tracer.nextSpan().name("InventoryServiceLookup");

        try (Tracer.SpanInScope isLookup = tracer.withSpanInScope(inventoryServiceLookup.start())) {

            inventoryServiceLookup.tag("call", "inventory-service");

        return "Succesful";
    }
}
