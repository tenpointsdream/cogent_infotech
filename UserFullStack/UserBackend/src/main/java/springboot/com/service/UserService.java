package springboot.com.service;

import java.util.List;

import springboot.com.entity.User;

public interface UserService {

	void addUser(User user);

	void updateUser(Long id, User user);

	List<User> getUsers();

	void deleteUser(Long userId);


}