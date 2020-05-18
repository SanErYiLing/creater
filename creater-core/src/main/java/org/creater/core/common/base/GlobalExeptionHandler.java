package org.creater.core.common.base;

import javax.servlet.http.HttpServletRequest;

import org.creater.common.response.ResponseMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExeptionHandler {

	@ExceptionHandler(value = Exception.class)
	@ResponseBody
	public ResponseMessage handException(HttpServletRequest request, Exception e) {
		return ResponseMessage.fail(e.getMessage());
	}
}
