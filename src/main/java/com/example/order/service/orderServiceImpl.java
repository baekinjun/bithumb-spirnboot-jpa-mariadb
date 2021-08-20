package com.example.order.service;

import com.example.order.domain.Order;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class orderServiceImpl implements orderService{
    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public Optional<Order> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void save(Order user) {

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
