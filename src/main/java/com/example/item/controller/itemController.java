package com.example.item.controller;

import com.example.item.domain.Item;
import com.example.item.repository.itemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/item")
public class itemController {
    private final itemRepository itemRepository;

    @GetMapping
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Item> findById(@PathVariable long id) {
        return Optional.empty();
    }

    @PostMapping
    public void save(Item item) {
        itemRepository.save(item);
    }

    @PutMapping
    public void update(Item item) {
        itemRepository.save(item);

    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return itemRepository.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return itemRepository.count();
    }

    @DeleteMapping
    public void deleteById(long id) {
        itemRepository.deleteById(id);

    }
}
