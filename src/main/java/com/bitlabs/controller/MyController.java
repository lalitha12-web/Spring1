package com.bitlabs.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bitlabs.dao.DaoImpl;
import com.bitlabs.dao.DaoInterface;
import com.bitlabs.entity.Student;


@Controller
public class MyController {

	DaoInterface dao=new DaoImpl();
	
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}

	@RequestMapping(value="/reqRegister",method=RequestMethod.POST)
	public String saveStudentDetails(@ModelAttribute Student std) {
		dao.saveStudentDetails(std);
		return "success";
		
	}
	
	
	@RequestMapping("/reqViewALlStudents")
	public ModelAndView viewAllStudents(){
		
		List<Student> list=dao.viewAllStudents();
		
		ModelAndView mav=new ModelAndView("success");
		mav.addObject("students",list);
		
		return mav;
	}
	

	@RequestMapping("/reqDeleteStudent")
	 public String deleteStudent(@ModelAttribute Student std) {
		 
		 dao.deleteStudent(std.getId());
		 
		 return "success";
	 }
	
	
	 @RequestMapping("/getStudentById")
	 public ModelAndView getStudentById(@ModelAttribute Student std) {
		 
		 Student std1=dao.getStudentById(std.getId());
		 ModelAndView mav=new ModelAndView("success");
		 mav.addObject("student",std1);
		 
		 
		 return mav;
		 
		 
		 
	 }
	 @RequestMapping("/updateStudentById")
	 public String updateStudent(@ModelAttribute Student std) {
		 
		 dao.updateStudent(std);
		 
		 return "success";
	 }
	 
	
	
}
