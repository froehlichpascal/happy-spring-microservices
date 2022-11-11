package at.happy.lagerservice.model.generator;

import at.happy.lagerservice.model.Item;
import at.happy.lagerservice.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile({"LOCAL", "DEV"})
@Component
@RequiredArgsConstructor
public class ItemDataGenerator {

    final ItemRepository itemRepository;

    void genarateItems(){
        itemRepository.save(Item.builder().name("Hockey Pants").shortName("hockey-pants").available(2).build());
        itemRepository.save(Item.builder().name("Hockey Gloves").shortName("hockey-gloves").available(1).build());
        itemRepository.save(Item.builder().name("Hockey Skates").shortName("hockey-skates").available(0).build());
    }
}
