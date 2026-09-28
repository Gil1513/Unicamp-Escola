package com.localhost.app.model.entities.exceptions;

import java.io.Serializable;

/**
 * Representa uma data invalida na aplicação, por quaisquer que sejam os n motivos
 * @author lucas
 * @version 0.1
 */
public class DataInvalidaException extends Exception implements Serializable{

	private static final long serialVersionUID = 1L;

	public DataInvalidaException() {
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public DataInvalidaException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
