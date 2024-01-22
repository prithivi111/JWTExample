package org.example.jwtexample.service;

import org.example.jwtexample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {
private List<User> store = new ArrayList<>();

public UserService(){
    store.add(new User(UUID.randomUUID().toString(), "Suraj", "suraj1808@hotmail.com"));
    store.add(new User(UUID.randomUUID().toString(), "Raj", "raj1808@hotmail.com"));
    store.add(new User(UUID.randomUUID().toString(), "Shrestha", "shrestha1808@hotmail.com"));
}

public List<User> getUsers(){
    return this.store;
}
}

