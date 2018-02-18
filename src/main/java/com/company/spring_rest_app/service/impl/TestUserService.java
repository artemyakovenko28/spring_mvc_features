package com.company.spring_rest_app.service.impl;

import com.company.spring_rest_app.model.User;
import com.company.spring_rest_app.service.UserService;
import org.fluttercode.datafactory.impl.DataFactory;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class TestUserService implements UserService {
    private Map<Long, User> memory = new HashMap<>();

    private AtomicLong counter = new AtomicLong(0);

    @PostConstruct
    private void init() {
        List<String> roles = Arrays.asList("admin", "user", "guest");
        DataFactory dataFactory = new DataFactory();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            Long userId = counter.incrementAndGet();
            user.setId(userId);
            user.setPassword(dataFactory.getRandomWord());
            user.setEmail(dataFactory.getEmailAddress());
            user.setName(dataFactory.getName());
            user.setRole(dataFactory.getItem(roles));
            memory.put(counter.incrementAndGet(), user);
        }
    }

    @Override
    public User getUserById(Long id) {
        return memory.get(id);
    }

    @Override
    public User saveUser(User user) {
        Long userId = counter.incrementAndGet();
        user.setId(userId);
        memory.put(userId, user);
        return user;
    }

}
