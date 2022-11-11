package at.happy.lagerservice.controller;

import at.happy.dto.ItemRequest;
import at.happy.dto.ItemResponse;
import at.happy.lagerservice.repository.ItemRepository;
import at.happy.lagerservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lager")
public class LagerController {

    private final ItemService itemService;

    private final ItemRepository itemRepository;

    @PostMapping(value = "in-stock")
    public ItemResponse getHockeyteamByShortName(@RequestBody ItemRequest itemRequest) {

        var itemToCheck = itemService.getItemByItemShortName(itemRequest.getShortName());

        return itemToCheck != null ?
                ItemResponse.builder()
                        .shortName(itemToCheck.getShortName())
                        .isInStock(itemService.isInStock(itemToCheck))
                        .build() : null;
    }
}

