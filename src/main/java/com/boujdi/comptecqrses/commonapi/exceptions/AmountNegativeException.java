package com.boujdi.comptecqrses.commonapi.exceptions;

public class AmountNegativeException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AmountNegativeException(String message) {
		super(message);
	}

}
