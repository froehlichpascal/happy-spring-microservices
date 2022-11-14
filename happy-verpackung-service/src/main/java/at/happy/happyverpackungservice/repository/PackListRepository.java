package at.happy.happyverpackungservice.repository;

import at.happy.happyverpackungservice.model.PackList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PackListRepository extends JpaRepository<PackList, Long> {
}
