package kr.lifesymantics.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import kr.lifesymantics.mapper.TestMapper;

@RestController
public class TestController {
	
	@Autowired
	TestMapper testMapper;
	
	@RequestMapping("/freemarker")
	ModelAndView mav(){
		System.out.println("Hello Here!@");
		ModelAndView model = new ModelAndView();
		model.setViewName("test");
		model.addObject("name", "sjan");
		return model;
	}
	
	@RequestMapping("/mybatis")
	ModelAndView mybatisTest(){
		ModelAndView model = new ModelAndView();
		model.setViewName("mybatisTest");
		String str = "0000000002";
		List<Map<String,String>> result = testMapper.select(str);
		
		model.addObject("result", result);
		return model;
	}
	
	@RequestMapping("/login")
	ModelAndView login(HttpServletRequest request,HttpServletResponse response,@RequestParam Optional<String> error){
		ModelAndView model = new ModelAndView();
		model.setViewName("login");
		model.addObject("error",error);
		HttpSession session = request.getSession();
		model.addObject("session",session.getAttribute("SPRING_SECURITY_LAST_EXCEPTION"));
				
		return model;
	}

}
