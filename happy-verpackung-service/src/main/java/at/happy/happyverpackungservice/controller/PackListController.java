package at.happy.happyverpackungservice.controller;

import at.happy.happyverpackungservice.model.PackList;
import at.happy.happyverpackungservice.repository.PackListRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/packlist")
public class PackListController {

    private final PackListRepository packListRepository;

    @GetMapping(value = "")
    public List<PackList> getAll() {
        return packListRepository.findAll();
    }
}

