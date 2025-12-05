package com.prowings.Java2025.Exception.ThrowsDemo;

public class InvalidVoterException extends Exception{

	public InvalidVoterException() {
		super();
	}

	public InvalidVoterException(Throwable t) {
		super(t);
	}


	public InvalidVoterException(String message) {
		super(message);
	}

	
	
}