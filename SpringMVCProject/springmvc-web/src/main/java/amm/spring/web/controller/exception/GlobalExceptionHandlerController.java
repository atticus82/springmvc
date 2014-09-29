package amm.spring.web.controller.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import amm.spring.common.exception.SpringMVCException;

@ControllerAdvice
public class GlobalExceptionHandlerController {

	@ExceptionHandler(SpringMVCException.class)
	public ModelAndView handleCustomException(SpringMVCException ex) {
		ModelAndView model = new ModelAndView(ex.getPage());
		if (ex.getModel() != null) {
			model = ex.getModel();
		}
		model.setViewName(ex.getPage());
		model.addObject("springException", ex);
		return model;

	}
	
	@ExceptionHandler(Exception.class)
	public String handleAllException(HttpServletRequest req, Exception ex) {
		ModelAndView model = new ModelAndView("errors/generic_error");
		model.addObject("errMsg", "this is Exception.class :" + ex.getClass());
		return "errors/notFound";

	}
	

	@ExceptionHandler(ResourceNotFoundException.class)
	public String handleResourceNotFoundException() {
		return "errors/notFound";
	}

	
	
}
