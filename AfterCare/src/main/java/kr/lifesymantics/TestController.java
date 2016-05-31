package kr.lifesymantics;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	@RequestMapping("/freemarker")
	ModelAndView mav(){
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		model.addObject("name", "sjan");
		return model;
	}
	
	@Autowired
	TestMapper testMapper;
	
	@RequestMapping("/mybatis")
	ModelAndView mybatisTest(){
		ModelAndView model = new ModelAndView();
		model.setViewName("mybatisTest");
		String str = "0000000002";
		List<Map<String,String>> result = testMapper.select(str);
		
		model.addObject("result", result);
		return model;
	}

}
