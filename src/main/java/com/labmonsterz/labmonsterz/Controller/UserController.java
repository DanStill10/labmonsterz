package com.labmonsterz.labmonsterz.Controller;

import com.labmonsterz.labmonsterz.Entity.User;
import com.labmonsterz.labmonsterz.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping
    public Collection<User> getUsers() {
        return userService.getUsers();
    }

    @PostMapping
    public User postUser(@RequestBody User user){
        return userService.createUser(user);
    }
    @RequestMapping(value = "/user/{id}")
    public Optional<User> getUserByUname(@PathVariable("uname") String uname) {
        return userService.getUsersByUname(uname);
    }
}
