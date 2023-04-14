package springboot.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.com.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUsername(String name);

	boolean existsByUserName(String username);
}
