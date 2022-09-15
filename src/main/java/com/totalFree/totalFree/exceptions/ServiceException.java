package com.totalFree.totalFree.exceptions;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

	private String errorCode;
	private HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
	private Exception ex;

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public HttpStatus getHttpStatus() {
		return httpStatus;
	}

	public void setHttpStatus(HttpStatus httpStatus) {
		this.httpStatus = httpStatus;
	}

	public Exception getEx() {
		return ex;
	}

	public void setEx(Exception ex) {
		this.ex = ex;
	}

	public ServiceException(String errorCode) {
		super();
		this.errorCode = errorCode;
	}

	public ServiceException(String errorCode, HttpStatus httpStatus) {
		super();
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
	}

	public ServiceException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public ServiceException(String errorCode, HttpStatus httpStatus, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
	}

	public ServiceException(String errorCode, HttpStatus httpStatus, Exception ex) {
		super();
		this.errorCode = errorCode;
		this.httpStatus = httpStatus;
		this.ex = ex;
	}
}
