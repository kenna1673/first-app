package Doby.Ohara.signup.domain.user.controllers;

import Doby.Ohara.signup.domain.user.expections.UserNotFoundException;
import Doby.Ohara.signup.domain.user.model.User;
import Doby.Ohara.signup.domain.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public Iterable<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/users")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/users/{id}")
    public User getById(@PathVariable("id") Long id) throws UserNotFoundException {
        return userService.getUserById(id);
    }
}
