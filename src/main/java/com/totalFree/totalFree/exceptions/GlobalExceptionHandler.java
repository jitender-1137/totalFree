package com.totalFree.totalFree.exceptions;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.totalFree.totalFree.dto.ErrorResponseDto;

import lombok.extern.slf4j.Slf4j;

@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends ResponseEntityExceptionHandler {

	@Autowired
	MessageSource messageSource;

	@ExceptionHandler(ServiceException.class)
	public ResponseEntity<ErrorResponseDto> handle(ServiceException ex) {
		String errorCode = ex.getErrorCode();
		String errorMessage = null;
		ErrorResponseDto errorResponseDto = null;
		HttpStatus httpStatus = ex.getHttpStatus();
		errorMessage = messageSource.getMessage(errorCode, null, null);
		if (StringUtils.hasLength(errorMessage)) {
			errorResponseDto = new ErrorResponseDto(errorCode, errorMessage);
		} else {
			errorMessage = errorCode;
			errorResponseDto = new ErrorResponseDto(errorMessage);
		}
//		log.error("Service Exception | errorCode : {} | errorMessage : {} | httpStatus : {}", errorCode, errorMessage, httpStatus);
		return ResponseEntity.status(httpStatus).body(errorResponseDto);
	}
}
