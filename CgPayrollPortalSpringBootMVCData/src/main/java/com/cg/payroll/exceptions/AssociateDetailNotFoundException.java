package com.cg.payroll.exceptions;

public class AssociateDetailNotFoundException extends Exception {

	public AssociateDetailNotFoundException() {
		super();
	}

	public AssociateDetailNotFoundException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public AssociateDetailNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public AssociateDetailNotFoundException(String message) {
		super(message);
	}

	public AssociateDetailNotFoundException(Throwable cause) {
		super(cause);
	}
	
}
