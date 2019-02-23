package com.cg.billing.exceptions;
@SuppressWarnings("serial")
public class PlanDetailsNotFoundException extends Exception {
	public PlanDetailsNotFoundException() {
		super();
	}
	public PlanDetailsNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public PlanDetailsNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}
	public PlanDetailsNotFoundException(String message) {
		super(message);
	}
	public PlanDetailsNotFoundException(Throwable cause) {
		super(cause);
	}
}