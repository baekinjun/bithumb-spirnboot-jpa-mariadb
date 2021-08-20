package com.example.order.controller;

import com.example.order.domain.Order;
import com.example.order.repository.orderRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/order")
public class orderController {
    private final orderRepository orderRepository;
    @GetMapping
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Order> findById(@PathVariable long id) {
        return orderRepository.findById(id);
    }

    @PostMapping
    public void save(Order order) {
        orderRepository.save(order);
    }

    @PutMapping
    public void update(Order order) {
        orderRepository.save(order);
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return orderRepository.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return orderRepository.count();
    }

    @DeleteMapping
    public void deleteById(long id) {
        orderRepository.deleteById(id);
    }
}
