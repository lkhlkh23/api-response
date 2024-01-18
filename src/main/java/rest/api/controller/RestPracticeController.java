package rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import rest.api.controller.dto.Response;
import rest.api.exception.WordMatchException;
import rest.api.type.ResponseStatusCode;

@RestController
@Slf4j
public class RestPracticeController {

	@GetMapping("/keyword")
	public Response<String> getValue(@RequestParam(name = "word", required = false, defaultValue = "") final String word) throws Exception {
		if("ex".equals(word)) {
			throw new WordMatchException("Invalid Keyword Error. keyword : " + word);
		}

		if("e".equals(word)) {
			throw new Exception("Business logic Error. keyword : " + word);
		}

		log.info("parameter : {}", word);

		return new Response<String>(word, null, ResponseStatusCode.SUCCESS);
	}

}
