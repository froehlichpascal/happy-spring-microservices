package at.happy.lagerservice.repository;

import at.happy.lagerservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findItemByShortName(String shortName);
}
