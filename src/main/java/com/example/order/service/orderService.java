package com.example.order.service;

import com.example.item.domain.Item;
import com.example.order.domain.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface orderService {
    List<Order> findAll();

    Optional<Order> findById(long id);

    void save(Order user);

    boolean existsById(long id);

    long count();

    void deleteById(long id);
}
