package com.example.user.controller;

import com.example.user.domain.User;
import com.example.user.repository.userRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class userController {
    private final userRepository userRepository;

    @GetMapping
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<User> findById(@PathVariable long id) {
        return userRepository.findById(id);
    }

    @PostMapping
    public void save(User user) {
        userRepository.save(user);
    }

    @PutMapping
    public void update(User user) {
        userRepository.save(user);
    }

    @GetMapping("/exists/{id}")
    public boolean existsById(@PathVariable long id) {
        return userRepository.existsById(id);
    }

    @GetMapping("/count")
    public long count() {
        return userRepository.count();
    }

    @DeleteMapping
    public void deleteById(long id) {
        userRepository.deleteById(id);
    }
}
