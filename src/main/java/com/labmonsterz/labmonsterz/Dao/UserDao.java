package com.labmonsterz.labmonsterz.Dao;

import com.labmonsterz.labmonsterz.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.Optional;

@Component
public class UserDao {
    @Autowired
    private UserRepository repository;

    public Collection<User> getUsers() {
        return repository.findAll();
    }

    public User createUser(User user) {
        return repository.insert(user);
    }

    public Optional<User> getUserByUname(String uname) {
        return repository.   }
}
