package com.cg.billing.exceptions;
@SuppressWarnings("serial")
public class CustomerDetailsNotFoundException extends Exception {
	public CustomerDetailsNotFoundException() {
		super();
	}
	public CustomerDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public CustomerDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public CustomerDetailsNotFoundException(String message) {
		super(message);
	}
	public CustomerDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}