package com.SpringBoot.jbk.Student_App.student;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> student = new ArrayList<Student>();
		 studentRepository.findAll().forEach(student::add);
		return student;
		
	}

	public void addStudent(Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
	}

	public Student getOneStudent(String id) {
		// TODO Auto-generated method stub
		return studentRepository.findById(id).orElse(null);
		
	}

	public void updateStudent(String id, Student s) {
		// TODO Auto-generated method stub
		studentRepository.save(s);
	}

	public void deleteStudent(String id) {
		// TODO Auto-generated method stub
		studentRepository.deleteById(id);
	}
}
