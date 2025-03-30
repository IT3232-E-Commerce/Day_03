package lk.ac.vau.fas.ict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;

@RestController
@RequestMapping("/app")
public class AppController {
	Student Bob = new Student("2021ICT01", "Bob Marely", 23, "IT", 3.2);
	Student James = new Student("2021ICT02", "James Bond", 24, "IT", 3.3);
	Student Donald = new Student("2021ICT03", "Donald Trump", 23, "IT", 2.8);
	
    @GetMapping("/home")
    public String homeMessage() {
        return "Welcome to Student Managemant System!";
    }
    
    @GetMapping("/student")
    public Student getStudent() {
        return Bob;
    }
}
