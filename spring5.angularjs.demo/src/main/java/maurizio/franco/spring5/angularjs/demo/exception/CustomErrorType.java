package maurizio.franco.spring5.angularjs.demo.exception;

import maurizio.franco.spring5.angularjs.demo.entity.UserDTO;

public class CustomErrorType extends UserDTO {
	private String errorMessage;

	public CustomErrorType(final String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
}
