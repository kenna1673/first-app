package Doby.Ohara.signup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SignUpApplication {
	private static Logger logger = LoggerFactory.getLogger(SignUpApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SignUpApplication.class, args);
	}
}
