package com.cg.billing.exceptions;
@SuppressWarnings("serial")
public class PostpaidAccountNotFoundException extends Exception {
	public PostpaidAccountNotFoundException() {
		super();
	}
	public PostpaidAccountNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public PostpaidAccountNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public PostpaidAccountNotFoundException(String message) {
		super(message);
	}
	public PostpaidAccountNotFoundException(Throwable cause) {
		super(cause);
	}
}