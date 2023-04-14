package springboot.com;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.password.PasswordEncoder;

import springboot.com.entity.User;
import springboot.com.repository.UserRepository;

@SpringBootApplication
public class MovieLibrarySystemApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;
	@Autowired
	private UserRepository userRepository;

	@PostConstruct
	public void userInit() {
		User user1 = new User(null, "john", passwordEncoder.encode("password"), "user1@gmail.com");
		User user2 = new User(null, "jane", passwordEncoder.encode("password"), "user2@gmail.com");
		userRepository.saveAll(Arrays.asList(user1, user2));
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieLibrarySystemApplication.class, args);
	}

}
