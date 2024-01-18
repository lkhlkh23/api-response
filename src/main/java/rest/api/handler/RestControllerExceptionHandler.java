package rest.api.handler;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import lombok.extern.slf4j.Slf4j;
import rest.api.controller.dto.Response;
import rest.api.exception.WordMatchException;
import rest.api.type.ResponseStatusCode;

@RestControllerAdvice
@Slf4j
public class RestControllerExceptionHandler {

	@ExceptionHandler(WordMatchException.class)
	public Response wordMatchException(final WordMatchException e) {
		log.warn(e.getMessage());
		return new Response(null, e.getMessage(), ResponseStatusCode.FAIL);
	}

	@ExceptionHandler(Exception.class)
	@ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Response exception(final Exception e) {
		log.warn(e.getMessage());
		return new Response(null, e.getMessage(), ResponseStatusCode.FAIL);
	}

}
