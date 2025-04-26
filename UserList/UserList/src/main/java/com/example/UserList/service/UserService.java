package com.example.UserList.service;

import com.example.UserList.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<User> obtenerUsuarios() {
        return Arrays.asList(
            new User("Rene", "Lemus", "rene@gmail.com"),
            new User("Mario", "Santamaria", null),
            new User("Juliana", "Lemus", "julina.lemus@example.com")
        );
    }
}

