package springboot.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.com.entity.User;
import springboot.com.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	@Override
	public void updateUser(Long id, User user) {
		Optional<User> optionalUser = userRepository.findById(id);
		if (optionalUser.isPresent()) {
			User oldUser = optionalUser.get();
			oldUser.setName(user.getName());
			oldUser.setAge(user.getAge());
			oldUser.setSalary(user.getSalary());
			userRepository.save(oldUser);
		}
	}

	@Override
	public List<User> getUsers() {
		return userRepository.findAll();
	}

	@Override
	public void deleteUser(Long userId) {
		userRepository.deleteById(userId);
	}


	

}
