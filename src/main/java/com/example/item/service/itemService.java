package com.example.item.service;

import com.example.item.domain.Item;
import com.example.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface itemService {
    List<Item> findAll();

    Optional<Item> findById(long id);

    void save(Item user);

    boolean existsById(long id);

    long count();

    void deleteById(long id);
}
