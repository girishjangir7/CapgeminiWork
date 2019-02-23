package com.cg.billing.exceptions;
@SuppressWarnings("serial")
public class BillDetailsNotFoundException extends Exception {
	public BillDetailsNotFoundException() {
		super();
	}
	public BillDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public BillDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public BillDetailsNotFoundException(String message) {
		super(message);
	}
	public BillDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}