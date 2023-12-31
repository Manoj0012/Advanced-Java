package com.example.JPADEMO;

import com.example.JPADEMO.DAO.StudentDAO;
import com.example.JPADEMO.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JpademoApplication {
	public static void main(String[] args) {
		SpringApplication.run(JpademoApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO){
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO){
		System.out.println("Creating new student object ... ");
		Student tempStudent = new Student("John","Jackson","john.802248@sxcce.edu.in");
		System.out.println("Saving the student");
		studentDAO.save(tempStudent);
		System.out.println("Saved student. Generated id:"+tempStudent.getId());
	}

}
