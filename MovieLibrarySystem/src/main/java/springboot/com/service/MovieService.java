package springboot.com.service;

import java.util.List;
import java.util.Optional;

import springboot.com.entity.Movie;

public interface MovieService {
	List<Movie> getAllMovies();

	Optional<Movie> getMovieById(Long id);

	Movie updateMovie(Movie movie);

	Movie addMovie(Movie movie);

	void deleteMovie(Long id);

	void deleteAllMovies();

	List<Movie> getMovieByGenre(String genre);
}
