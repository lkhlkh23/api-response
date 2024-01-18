package rest.api.exception;

public class WordMatchException extends RuntimeException {

	public WordMatchException() {
	}

	public WordMatchException(String message) {
		super(message);
	}

	public WordMatchException(String message, Throwable cause) {
		super(message, cause);
	}

	public WordMatchException(Throwable cause) {
		super(cause);
	}

	public WordMatchException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
