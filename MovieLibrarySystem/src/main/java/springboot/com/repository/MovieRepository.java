package springboot.com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.com.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

	List<Movie> findByMovieGenre(String genre);
}
