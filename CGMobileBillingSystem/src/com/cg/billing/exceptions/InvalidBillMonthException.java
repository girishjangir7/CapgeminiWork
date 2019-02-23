package com.cg.billing.exceptions;
@SuppressWarnings("serial")
public class InvalidBillMonthException extends Exception {
	public InvalidBillMonthException() {
		super();
	}
	public InvalidBillMonthException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public InvalidBillMonthException(String message, Throwable cause) {
		super(message, cause);
	}
	public InvalidBillMonthException(String message) {
		super(message);
	}
	public InvalidBillMonthException(Throwable cause) {
		super(cause);
	}
}