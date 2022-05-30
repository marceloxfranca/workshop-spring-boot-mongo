package com.marcelofranca.workshopmongo.services;

import com.marcelofranca.workshopmongo.domain.User;
import com.marcelofranca.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> finAll() {
        return repo.findAll();
    }
}
