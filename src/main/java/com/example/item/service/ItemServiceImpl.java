package com.example.item.service;

import com.example.item.domain.Item;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemServiceImpl implements itemService {
    @Override
    public List<Item> findAll() {
        return null;
    }

    @Override
    public Optional<Item> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void save(Item user) {

    }

    @Override
    public boolean existsById(long id) {
        return false;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(long id) {

    }
}
