package com.example.demo.constants;

public enum ErrorConstants {

	EMPLOYEE_NOT_FOUND("I AM FROM ENUM .... EMPLOYEE NOT FOUND!!!"),
	EMPLOYEE_NOT_FOUND1("I AM FROM ENUM .... EMPLOYEE NOT FOUND but different!!!");
	
	
	String message;
	
	
	 ErrorConstants(String message) {
		
		 this.message = message;
		 
	}


	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}


	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	 
	 
	 
	
	
}
