package at.happy.hockeyteamservice.controller;

import at.happy.hockeyteamservice.dto.ItemResponse;
import at.happy.hockeyteamservice.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/lager")
public class LagerController {

    private final ItemService itemService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public ItemResponse getHockeyteamByShortName(@RequestParam String shortName) {
        return ItemResponse.builder()
                .shortName(shortName)
                .isInStock(itemService.isInStock(shortName))
                .build();
    }
}

