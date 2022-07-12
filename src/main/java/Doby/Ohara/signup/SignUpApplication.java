package Doby.Ohara.signup;

import Doby.Ohara.signup.domain.user.model.User;
import Doby.Ohara.signup.domain.user.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignUpApplication implements CommandLineRunner {
	private static Logger logger = LoggerFactory.getLogger(SignUpApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SignUpApplication.class, args);
	}

	@Autowired
	private UserService userService;

	@Override
	public void run(String... args) throws Exception {
		User user = new User("Mckkena", "ohara", "email", "password");
		user = userService.create(user);
		logger.info(user.toString());
	}
}
