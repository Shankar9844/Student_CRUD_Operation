package com.example.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Model.Student;


@RestController
@RequestMapping("/stud")
public class StudentControler
{
	 Student st;
	@PostMapping
      public String addStudent( @RequestBody Student st)
      {
		this.st=st;
		return "Student added successully";
      }
	@GetMapping(value="{id}")
	public Student displayStudent(String id)
	{
		return st;
	}
	@PutMapping
	public String updateStudent(@RequestBody Student st)
	{
		this.st=st;
		return "updated successfully";
	}
	
	@DeleteMapping(value=" {id}")
	public String updateStudent(String id)
	{
		this.st=null;
		return "deleted successfully";
	}
	
}
