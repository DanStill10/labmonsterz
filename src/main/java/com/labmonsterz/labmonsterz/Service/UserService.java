package com.labmonsterz.labmonsterz.Service;

import com.labmonsterz.labmonsterz.Dao.UserDao;
import com.labmonsterz.labmonsterz.Entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public Collection<User> getUsers() {
        return userDao.getUsers();
    }

    public User createUser(User user) {
        return userDao.createUser(user);
    }

    public Optional<User> getUsersByUname(String uname) {
        return userDao.getUserByUname(uname);
    }
}
