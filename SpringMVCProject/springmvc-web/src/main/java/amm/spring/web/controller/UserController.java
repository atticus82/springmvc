package amm.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
	
	
	@RequestMapping(value = "/user", method = RequestMethod.GET)
	public ModelAndView testPage() throws Exception {
		System.out.println("entrando en user");
		if(1 >= 0){
//			throw new SpringMVCException("PROBANDO");
			throw new Exception();
		}
		
		ModelAndView model = new ModelAndView();
		model.addObject("title", "Spring Security Custom Login Form");
		model.addObject("message", "This is protected page!");
		model.setViewName("admin");

		return model;

	}
}
