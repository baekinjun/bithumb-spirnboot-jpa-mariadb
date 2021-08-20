package com.example.user.service;

import com.example.user.domain.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface userService {
    List<User> findAll();

    Optional<User> findById(long id);

    void save(User user);

    boolean existsById(long id);

    long count();

    void deleteById(long id);
}
