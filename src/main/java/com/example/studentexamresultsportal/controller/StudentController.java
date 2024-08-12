package com.example.studentexamresultsportal.controller;

import com.example.studentexamresultsportal.model.Student;
import com.example.studentexamresultsportal.model.Result;
import com.example.studentexamresultsportal.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{rollNumber}")
    public String getStudentResults(@PathVariable String rollNumber, Model model) {
        Student student = studentService.getStudentByRollNumber(rollNumber);
        List<Result> results = studentService.getResultsByRollNumber(rollNumber);
        model.addAttribute("student", student);
        model.addAttribute("results", results);
        return "student/studentResults";
    }
    
    @GetMapping("/student/dashboard")
    public String studentDashboard() {
        return "student/dashboard";  // student/dashboard.html
    }

    @GetMapping("/student/view-results")
    public String viewResults() {
        return "student/view-results";  // student/view-results.html
    }
}
