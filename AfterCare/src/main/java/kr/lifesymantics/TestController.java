package kr.lifesymantics;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {
	
	String test(Model model){
		model.addAttribute("name", "sjan");
		System.out.println("name :: "+model);
		return "test";
	}
	
	@RequestMapping("/test")
	ModelAndView mav(){
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		model.addObject("name", "sjan");
		return model;
	}

}
