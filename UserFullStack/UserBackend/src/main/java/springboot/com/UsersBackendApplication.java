package springboot.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import springboot.com.entity.User;
import springboot.com.service.UserService;

@SpringBootApplication
public class UsersBackendApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(UsersBackendApplication.class, args);
		UserService userService = ctx.getBean(UserService.class);
		userService.addUser(new User("Sam", 30, 70000.0));
		userService.addUser(new User("Tom", 40, 60000.0));

	}

}
