package springboot.com.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import springboot.com.controller.UsernameTakenException;
import springboot.com.entity.User;
import springboot.com.repository.UserRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username);
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getEmail(),
				new ArrayList<>());
	}

	public User registerNewUser(User user) throws UsernameTakenException {
		if (userRepository.existsByUserName(user.getUsername()))
			throw new UsernameTakenException("Username is already taken!!");
		return userRepository.save(user);
	}

	public User getUserByUsername(String username) {
		if (userRepository.findByUsername(username) == null)
			throw new UsernameNotFoundException("No username found!!");
		return userRepository.findByUsername(username);
	}
}

