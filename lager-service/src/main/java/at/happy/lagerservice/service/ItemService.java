package at.happy.hockeyteamservice.service;

import at.happy.hockeyteamservice.model.Item;
import at.happy.hockeyteamservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;

    public Item getItemByItemShortName(String itemShortName){
        return itemRepository.findItemByShortName(itemShortName).orElse(null);
    }

    public boolean isInStock(Item itemToCheck){
        return itemRepository.findById(itemToCheck.getId()).isPresent();
    }
}
