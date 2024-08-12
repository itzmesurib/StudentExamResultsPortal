package com.example.studentexamresultsportal.service;

import com.example.studentexamresultsportal.model.Student;
import com.example.studentexamresultsportal.model.Result;
import com.example.studentexamresultsportal.repository.StudentRepository;
import com.example.studentexamresultsportal.repository.ResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Autowired
    private ResultRepository resultRepository;

    public Student getStudentByRollNumber(String rollNumber) {
        return studentRepository.findByRollNumber(rollNumber);
    }

    public List<Result> getResultsByRollNumber(String rollNumber) {
        return resultRepository.findByRollNumber(rollNumber);
    }
}
