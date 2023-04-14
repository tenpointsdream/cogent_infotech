package springboot.com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.com.entity.Movie;
import springboot.com.repository.MovieRepository;

@Service
public class MovieServiceImpl implements MovieService {
	@Autowired
	private MovieRepository movieRepository;

	@Override
	public List<Movie> getAllMovies() {
		return (List<Movie>) movieRepository.findAll();
	}

	@Override
	public Optional<Movie> getMovieById(Long id) {
		return movieRepository.findById(id);
	}

	@Override
	public Movie updateMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public Movie addMovie(Movie movie) {
		return movieRepository.save(movie);
	}

	@Override
	public void deleteMovie(Long id) {
		movieRepository.deleteById(id);
	}

	@Override
	public void deleteAllMovies() {
		movieRepository.deleteAll();
	}

	@Override
	public List<Movie> getMovieByGenre(String genre) {
		return movieRepository.findByMovieGenre(genre);
	}
}
