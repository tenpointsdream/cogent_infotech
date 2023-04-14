package springboot.com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.com.entity.Movie;
import springboot.com.service.CustomUserDetailsService;
import springboot.com.service.MovieService;

@RequestMapping("/admin/")
@RestController
public class AdminController {

	@SuppressWarnings("unused")
	@Autowired
	private CustomUserDetailsService userDetailsService;

	@Autowired
	private MovieService movieService;

	@PostMapping("/add")
	void addMovie(Movie movie) {
		movieService.addMovie(movie);
		System.out.println("Movie added to the database!!");
	}

	@PutMapping("/update/{id}")
	Movie updateMovie(@PathVariable Long id, @RequestBody String releaseDate)
			throws NoMovieFoundException, NoMovieException {
		if (movieService.getAllMovies() == null)
			throw new NoMovieException("No movie in the database!!");
		if (movieService.getMovieById(id) == null)
			throw new NoMovieFoundException("No movie with provided ID found");
		Movie m = movieService.getMovieById(id).orElse(null);
		m.setReleaseDate(releaseDate);
		System.out.println("New release date updated for the movie ID " + id);
		return movieService.updateMovie(m);
	}

	@GetMapping("/list")
	List<Movie> getAllMovies() throws NoMovieException {
		if (movieService.getAllMovies() == null)
			throw new NoMovieException("No movie in the database!!");
		return movieService.getAllMovies();
	}

	@DeleteMapping("/delete/{id}")
	void deleteMovie(@PathVariable Long id) throws NoMovieException, NoMovieFoundException {
		if (movieService.getAllMovies() == null)
			throw new NoMovieException("No movie in the database!!");
		if (movieService.getMovieById(id) == null)
			throw new NoMovieFoundException("No movie with provided ID found");
		movieService.deleteMovie(id);
		System.out.println("Movie ID " + id + " is removed from the database!!");
	}

	@GetMapping("/list/genre")
	List<Movie> getMovieByGenre(@RequestBody String genre) throws NoMovieException, NoMovieFoundException {
		if (movieService.getAllMovies() == null)
			throw new NoMovieException("No movie in the database!!");
		if (movieService.getMovieByGenre(genre) == null)
			throw new NoMovieFoundException("No movie in the genre " + genre + " found!!");
		return movieService.getMovieByGenre(genre);
	}

}
