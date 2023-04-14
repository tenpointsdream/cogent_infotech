package springboot.com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import springboot.com.entity.Movie;
import springboot.com.entity.User;
import springboot.com.service.CustomUserDetailsService;
import springboot.com.service.MovieService;

@RequestMapping("/users/")
@RestController
public class UserController {

	@Autowired
	private CustomUserDetailsService userDetailsService;
	private List<Movie> favorites = new ArrayList<Movie>();
	@Autowired
	private MovieService movieService;

	@Autowired

	@PostMapping("/register")
	public ResponseEntity<?> registerUser(@RequestBody User user) throws UsernameTakenException {
		User newuser = userDetailsService.registerNewUser(user);
		return ResponseEntity.ok(newuser);
	}

	@PostMapping("/login")
	public ResponseEntity<?> loginUser(@RequestBody User user) throws InvalidCredentialsException {
		User theUser = userDetailsService.getUserByUsername(user.getUsername());
		if (!theUser.getPassword().equals(user.getPassword())) {
			throw new InvalidCredentialsException("Invalid username or password");
		}
		return ResponseEntity.ok().build();
	}

	@GetMapping("/list")
	List<Movie> getListOfMovies() throws NoMovieException {
		if (movieService.getAllMovies() == null) {
			throw new NoMovieException("There is no movie in the database!!");
		} else
			return movieService.getAllMovies();
	}

	@PostMapping("/add/{id}")
	void addMovie(@PathVariable Long id) throws NoMovieFoundException {
		if (movieService.getMovieById(id) == null)
			throw new NoMovieFoundException("No movie found with provided ID!!");
		else {
			favorites.add(movieService.getMovieById(id).orElse(null));
			System.out.println("Movie added to favorite list!!");
		}
	}

	@DeleteMapping("/delete/{id}")
	void deleteMovie(@PathVariable Long id) throws NoMovieFoundException, NoMovieException {
		if (favorites == null) {
			throw new NoMovieException("No movie in the favorite list!!");
		} else {
			boolean found = false;
			for (Movie movie : favorites) {
				if (movie.getId().equals(id))
					found = true;
			}
			if (!found)
				throw new NoMovieFoundException("No movie in the favorite list found with provided ID");
			else {
				System.out.println("Movie ID " + id + " is removed from favorite list!!");
			}
		}
	}

}
