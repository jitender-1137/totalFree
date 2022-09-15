package com.totalFree.totalFree.dto;

import org.slf4j.MDC;
import org.springframework.http.HttpStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponseDto<T> implements ResponseDto<T> {

	private Integer code = HttpStatus.OK.value();
	private T data;
	private String message;
	private long timestamp;
	private String requestId;
	private Long numItems;

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Long getNumItems() {
		return numItems;
	}

	public void setNumItems(Long numItems) {
		this.numItems = numItems;
	}

	public SuccessResponseDto() {
		this(null, "success");
	}

	public SuccessResponseDto(T data2) {
		this.data = data2;
	}

	public SuccessResponseDto(String successMessage) {
		this.message = successMessage;
	}

	public SuccessResponseDto(T data2, String successMessage) {
		this.data = data2;
		this.message = successMessage;
//		this.requestId = MDC.get(requestId);
		this.timestamp = System.currentTimeMillis();
	}

	public SuccessResponseDto(T data2, String successMessage, Long numItems) {
		this(data2, successMessage);
		this.numItems = numItems;
	}

}
