package rest.api.controller.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import rest.api.type.ResponseStatusCode;

@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@RequiredArgsConstructor
public class Response<T> {

	private final T data;
	private final String message;
	private final ResponseStatusCode status;

}
