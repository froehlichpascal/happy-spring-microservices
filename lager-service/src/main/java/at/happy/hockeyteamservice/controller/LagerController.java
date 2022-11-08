package at.happy.hockeyteamservice.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/hockeyteam")
public class HockeyteamController {

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> getHockeyteamByShortName(@RequestParam String teamShort) {
        return inventoryService.isInStock(skuCode);
    }
}
