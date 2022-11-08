package at.happy.hockeyteamservice.model;

import at.happy.hockeyteamservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"LOCAL", "DEV"})
@Component
@RequiredArgsConstructor
public class ItemDataGenerator {

    final ItemRepository itemRepository;
}
