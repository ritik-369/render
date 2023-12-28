package com.ritik.demo.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.servlet.ModelAndView;

import com.ritik.demo.entities.student;
import com.ritik.demo.services.studentServices;

import ch.qos.logback.core.model.Model;

@Controller
public class studentController implements CommandLineRunner{
	
	@Autowired
	studentServices stuService;
	
	
	studentController()
	{  

	}
	
	@RequestMapping("/")
	public ModelAndView home()
	{
		ModelAndView mv=new ModelAndView("home");
		mv.addObject("stuList", stuService.getAllStudents());
		return mv;
	}
	 
	@RequestMapping("addStudent")
	public ModelAndView addStudent()
	{
		ModelAndView mv=new ModelAndView("createStudent");
		return mv;
	}
	 
	@RequestMapping("updateStudent/{sId}")
	public ModelAndView updateStudent(@PathVariable int sId)
	{
		ModelAndView mv=new ModelAndView("update");
		mv.addObject("student", stuService.getStudent(sId));
		return mv;
	}
	
	@RequestMapping("deletestudent/{sId}")
	public String deleteStudent(@PathVariable int sId)
	{
		stuService.deleteStudent(sId);
		return "redirect:/";
	}
	
	 
	@PostMapping("create")
	public String createStudent(student stu)
	{   
		stu=new student(stu);
		stuService.saveStudent(stu);
		return "redirect:/";
	}
	
	
	@PostMapping("update")
	public String updateStudent(student stu)
	{
		System.out.println(stu);
		stuService.saveStudent(stu);
		return "redirect:/";
	}

	@Override
	public void run(String... args) throws Exception {
		student stu;
		stu=new student("Ritik Rathor","ritikrathore336699@gmail.com","Male");
		stuService.saveStudent(stu);
		stu=new student("Vivek Kumar","vpwr2004@gmail.com","Male");
		stuService.saveStudent(stu);
	}
	
	
}
