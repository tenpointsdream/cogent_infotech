package springboot.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import springboot.com.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

//	User findUserById(Long id);
}
