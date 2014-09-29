package amm.spring.business.exception;

import java.util.Locale;

import amm.spring.common.exception.SpringMVCException;

public class SpringMVCBusinessException extends SpringMVCException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public SpringMVCBusinessException(String code, Locale locale) {
		super(code, locale);
		// TODO Auto-generated constructor stub
	}



}
