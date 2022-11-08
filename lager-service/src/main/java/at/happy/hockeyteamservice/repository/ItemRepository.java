package at.happy.hockeyteamservice.repository;

import at.happy.hockeyteamservice.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ItemRepository extends JpaRepository<Item, Long> {
    Optional<Item> findItemByShortName(String shortName);
}
