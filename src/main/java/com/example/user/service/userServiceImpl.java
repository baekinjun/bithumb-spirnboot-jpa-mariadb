package com.example.user.service;

import com.example.user.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {
    @Override
    public List<User> findAll() {
        return null;
    }

    @Override
    public Optional<User> findById(long id) {
        return Optional.empty();
    }

    @Override
    public void save(User user) {

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
