package com.ritik.demo.services;
 
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ritik.demo.entities.student;
import com.ritik.demo.interfaces.studentInterface;

@Service
public class studentServices {
	
	@Autowired
	private studentInterface stuInterface;
	
	public void saveStudent(student stu)
	{
		stuInterface.save(stu);
	}
	
	public void updateStudent(student stu)
	{
		stuInterface.save(stu);
	}
	
	public student getStudent(int sId)
	{
		return stuInterface.getOne(sId);
	}
	
	public List<student>getAllStudents()
	{
		return stuInterface.findAll();
	}
	
	public void deleteStudent(int sId)
	{
		stuInterface.deleteById(sId);
	}
}
