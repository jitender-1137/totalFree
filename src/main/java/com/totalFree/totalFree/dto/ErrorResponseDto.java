package com.totalFree.totalFree.dto;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.slf4j.MDC;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponseDto<T> implements ResponseDto<T> {

	private String code;
	private T data;
	private List<String> message;
	private Long timestamp;
	private String requestId;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public List<String> getMessage() {
		return message;
	}

	public void setMessage(List<String> message) {
		this.message = message;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public ErrorResponseDto() {
	}

	public ErrorResponseDto(String errorMessage) {
		this.message = Collections.singletonList(errorMessage);
		this.timestamp = System.currentTimeMillis();
		this.requestId = MDC.get(requestId);
	}

	public ErrorResponseDto(String errorCode, String errorMessage) {
		this.code = errorCode;
		this.message = Collections.singletonList(errorMessage);
		this.timestamp = System.currentTimeMillis();
		this.requestId = MDC.get(requestId);
	}

	public ErrorResponseDto(String errorCode, String errorMessage, T data) {
		this.data = data;
		this.code = errorCode;
		this.message = Collections.singletonList(errorMessage);
		this.timestamp = System.currentTimeMillis();
		this.requestId = MDC.get(requestId);
	}

	public ErrorResponseDto(String errorCode, List<String> errorMessage) {
		this.code = errorCode;
		this.message = errorMessage;
		this.timestamp = System.currentTimeMillis();
		this.requestId = MDC.get("requestId");
	}
}
