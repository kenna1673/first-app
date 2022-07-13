package Doby.Ohara.signup.domain.user.expections;

public class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}
