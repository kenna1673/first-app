package Doby.Ohara.signup.domain.user.repos;

import Doby.Ohara.signup.domain.user.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface UserRepo extends CrudRepository<User, Long> {
}
