/**
 * 
 */
package com.example.demo.exception;

import java.util.Date;

/**
 * @author Tejora
 *
 */
public class EmployeeNotFoundException extends RuntimeException{

	
	String message;
	
	Date currentDate = new Date();

	
	
	
	public EmployeeNotFoundException(String message) {
		super();
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

	/**
	 * @return the currentDate
	 */
	public Date getCurrentDate() {
		return currentDate;
	}

	/**
	 * @param currentDate the currentDate to set
	 */
	public void setCurrentDate(Date currentDate) {
		this.currentDate = currentDate;
	}
	
	
	
	
	
}
