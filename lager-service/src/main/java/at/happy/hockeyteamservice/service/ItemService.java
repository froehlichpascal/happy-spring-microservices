package at.happy.hockeyteamservice.service;

import at.happy.hockeyteamservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;

    public boolean isInStock(String shortName){
        return itemRepository.findItemByShortName(shortName).isPresent();
    }
}
