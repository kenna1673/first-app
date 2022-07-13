package Doby.Ohara.signup.domain.user.service;

import Doby.Ohara.signup.domain.user.expections.UserNotFoundException;
import Doby.Ohara.signup.domain.user.model.User;

public interface UserService {
    User create(User user);
    Iterable<User> getAllUsers();
    User getUserById(Long id) throws UserNotFoundException;
}
