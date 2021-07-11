package com.tgroy.trackzilla.exception;

public class ApplicationNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -6614073390671889361L;

	public ApplicationNotFoundException(String exception) {
        super(exception);
    }
}
