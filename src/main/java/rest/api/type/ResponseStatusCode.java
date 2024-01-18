package rest.api.type;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public enum ResponseStatusCode {

	SUCCESS("success"), FAIL("fail"), ERROR("error");

	private String status;

}
