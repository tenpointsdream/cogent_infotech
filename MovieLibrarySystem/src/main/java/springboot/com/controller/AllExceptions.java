package springboot.com.controller;

public class AllExceptions {

}

@SuppressWarnings("serial")
class NoMovieException extends Exception {
	public NoMovieException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class NoMovieFoundException extends Exception {
	public NoMovieFoundException(String message) {
		super(message);
	}
}

@SuppressWarnings("serial")
class InvalidCredentialsException extends Exception {
	public InvalidCredentialsException(String message) {
		super(message);
	}
}