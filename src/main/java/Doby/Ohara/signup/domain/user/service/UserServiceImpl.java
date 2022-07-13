package Doby.Ohara.signup.domain.user.service;

import Doby.Ohara.signup.domain.user.expections.UserNotFoundException;
import Doby.Ohara.signup.domain.user.model.User;
import Doby.Ohara.signup.domain.user.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User create(User user) {
        return userRepo.save(user);
    }

    @Override
    public Iterable<User> getAllUsers() {
        return userRepo.findAll();
    }

    @Override
    public User getUserById(Long id) throws UserNotFoundException {
        Optional<User> user = userRepo.findById(id);
        if (user.isEmpty()) {
            throw new UserNotFoundException("User not found by id: " + id);
        }
        return user.get();
    }
}
